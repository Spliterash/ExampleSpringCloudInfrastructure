package ru.spliterash.sushi.exceptionHandle.client.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import ru.spliterash.sushi.exceptionHandle.client.FeignSushiErrorDecoder;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionService;
import ru.spliterash.sushi.exceptionHandle.resource.init.EnableSushiExceptionService;

@EnableSushiExceptionService
class FeignErrorDecoderConfiguration {
    @Bean
    public FeignSushiErrorDecoder feignSushiErrorDecoder(SushiExceptionService exceptionService, ObjectMapper mapper) {
        return new FeignSushiErrorDecoder(exceptionService, mapper);
    }
}
