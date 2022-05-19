package ru.spliterash.sushi.exceptionHandle.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;
import ru.spliterash.sushi.exceptionHandle.domain.UnknownSushiDomainException;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Log4j2
public class SushiExceptionService {
    /**
     * Ключ домен, значение конвертеры, для более быстрого поиска в runtime
     */
    private final Map<String, Collection<SushiApiExceptionConverter<?, ?>>> mappers;
    private final ObjectMapper objectMapper;

    public SushiExceptionService(Collection<SushiApiExceptionConverter<?, ?>> mappers, ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        //noinspection unchecked,rawtypes
        this.mappers = (Map<String, Collection<SushiApiExceptionConverter<?, ?>>>) (Map) mappers
                .stream()
                .collect(Collectors.groupingBy(SushiApiExceptionConverter::getDomain));
    }

    public SushiApiExceptionConverter<?, ?> findConverter(String domain, String reason) {
        return mappers
                .getOrDefault(domain, Collections.emptySet())
                .stream()
                .filter(m -> m.getReason().equals(reason))
                .findFirst()
                .orElse(null);
    }

    private UnknownSushiDomainException createUnknownDomainException(SushiExceptionResponse response) {
        return new UnknownSushiDomainException(response.getDomain(), response.getReason(), response.getDetails());
    }

    private SushiExceptionResponse createUnknownResponse(SushiDomainException exception) {
        return SushiExceptionResponse.builder()
                .details(exception.getDetails())
                .domain(exception.getDomain())
                .reason(exception.getReason())
                .build();
    }

    /**
     * Парсит ошибку в домен из запроса
     */
    public SushiDomainException parse(SushiExceptionResponse response) {
        SushiApiExceptionConverter<?, ?> exceptionConverter = findConverter(response.getDomain(), response.getReason());

        if (exceptionConverter == null)
            return createUnknownDomainException(response);
        try {
            return _parse(exceptionConverter, response.getData());
        } catch (Exception exception) {
            log.info("Fail parse " + response);
            exception.printStackTrace();

            return createUnknownDomainException(response);
        }
    }

    /**
     * Конвертирует домен в API модель
     */
    public SushiExceptionResponse convert(SushiDomainException exception) {
        SushiApiExceptionConverter<?, ?> converter = findConverter(exception.getDomain(), exception.getReason());
        if (converter == null)
            return createUnknownResponse(exception);
        try {
            return _convert(converter, exception);
        } catch (Exception ex) {
            log.warn("Failing convert " + exception.getClass().getName() + " to response");
            ex.printStackTrace();

            return createUnknownResponse(exception);
        }
    }

    private <E extends SushiDomainException, D> SushiExceptionResponse _convert(SushiApiExceptionConverter<?, ?> converter, E exception) {
        //noinspection unchecked
        D data = ((SushiApiExceptionConverter<E, D>) converter).writeResponse(exception);
        Map<String, Object> convertedData;
        if (data != null)
            //noinspection unchecked
            convertedData = objectMapper.convertValue(data, Map.class);
        else
            convertedData = null;

        return SushiExceptionResponse.builder()
                .reason(exception.getReason())
                .domain(exception.getDomain())
                .details(exception.getDetails())
                .data(convertedData)
                .build();
    }

    private <E extends SushiDomainException, D> E _parse(SushiApiExceptionConverter<E, D> exceptionConverter, Map<String, Object> map) {
        D data;

        if (map == null)
            data = null;
        else
            data = objectMapper.convertValue(map, exceptionConverter.getDataType());

        return exceptionConverter.readResponse(data);
    }

}
