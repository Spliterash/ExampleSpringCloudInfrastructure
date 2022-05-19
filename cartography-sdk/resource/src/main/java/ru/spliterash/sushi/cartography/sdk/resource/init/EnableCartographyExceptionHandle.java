package ru.spliterash.sushi.cartography.sdk.resource.init;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ComponentScan("ru.spliterash.sushi.cartography.sdk.resource")
public @interface EnableCartographyExceptionHandle {
}
