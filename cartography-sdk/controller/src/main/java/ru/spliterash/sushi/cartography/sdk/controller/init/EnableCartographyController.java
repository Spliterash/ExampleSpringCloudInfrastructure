package ru.spliterash.sushi.cartography.sdk.controller.init;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Включает контроллер картографии
 * <p>
 * Эту аннотацию надо вешать только на сервисах, которые являются картографией
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(CartographyControllerConfiguration.class)
public @interface EnableCartographyController {
}
