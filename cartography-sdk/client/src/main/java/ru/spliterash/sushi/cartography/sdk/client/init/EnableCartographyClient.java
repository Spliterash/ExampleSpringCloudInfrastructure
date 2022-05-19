package ru.spliterash.sushi.cartography.sdk.client.init;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import ru.spliterash.sushi.cartography.sdk.client.FeignCartographyClient;
import ru.spliterash.sushi.cartography.sdk.client.FeignCartographyGateway;
import ru.spliterash.sushi.cartography.sdk.resource.init.EnableCartographyExceptionHandle;
import ru.spliterash.sushi.exceptionHandle.client.init.EnableSushiExceptionClientDecoder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@EnableFeignClients(clients = FeignCartographyClient.class)
@EnableCartographyExceptionHandle
@EnableSushiExceptionClientDecoder
@Import(FeignCartographyGateway.class)
public @interface EnableCartographyClient {
}
