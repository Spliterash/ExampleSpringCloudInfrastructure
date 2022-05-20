package ru.spliterash.sushi.exceptionHandle.resource.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import ru.spliterash.sushi.exceptionHandle.resource.SushiApiExceptionConverter;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionService;

import java.util.Collection;

class SushiExceptionConfiguration {
    @Bean
    public SushiExceptionService sushiExceptionService(Collection<SushiApiExceptionConverter<?, ?>> converters, ObjectMapper mapper) {
        return new SushiExceptionService(converters, mapper);
    }
}
