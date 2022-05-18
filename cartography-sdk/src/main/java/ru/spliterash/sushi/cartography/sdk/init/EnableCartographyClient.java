package ru.spliterash.sushi.cartography.sdk.init;

import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.spliterash.sushi.cartography.sdk.SushiCartographyEndpoints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@EnableFeignClients(clients = SushiCartographyEndpoints.class)
public @interface EnableCartographyClient {
}
