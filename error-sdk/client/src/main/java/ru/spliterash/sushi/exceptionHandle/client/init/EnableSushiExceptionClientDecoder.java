package ru.spliterash.sushi.exceptionHandle.client.init;

import org.springframework.context.annotation.Import;
import ru.spliterash.sushi.exceptionHandle.resource.init.EnableSushiExceptionService;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({FeignErrorDecoderConfiguration.class})
public @interface EnableSushiExceptionClientDecoder {
}
