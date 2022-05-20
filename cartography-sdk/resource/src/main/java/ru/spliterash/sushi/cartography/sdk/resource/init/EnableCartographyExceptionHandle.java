package ru.spliterash.sushi.cartography.sdk.resource.init;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(CartographyExceptionHandleConfiguration.class)
public @interface EnableCartographyExceptionHandle {
}
