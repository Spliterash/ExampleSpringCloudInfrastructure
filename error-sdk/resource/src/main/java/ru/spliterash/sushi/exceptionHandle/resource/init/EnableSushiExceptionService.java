package ru.spliterash.sushi.exceptionHandle.resource.init;

import org.springframework.context.annotation.Import;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionService;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(SushiExceptionService.class)
public @interface EnableSushiExceptionService {
}
