package ru.spliterash.sushi.exceptionHandle.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionResponse;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionService;

@Component
@RequiredArgsConstructor
public class FeignSushiErrorDecoder implements ErrorDecoder {
    private final SushiExceptionService exceptionService;
    private final ObjectMapper mapper;

    @Override
    @SneakyThrows
    public Exception decode(String methodKey, Response response) {
        Response.Body body = response.body();
        if (body != null) {
            String responseBody = IOUtils.toString(body.asInputStream());

            SushiExceptionResponse sushiExceptionResponse = mapper.readValue(responseBody, SushiExceptionResponse.class);

            return exceptionService.parse(sushiExceptionResponse);
        }

        return new RuntimeException("Dont know");
    }
}
