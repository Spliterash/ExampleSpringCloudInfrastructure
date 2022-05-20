package ru.spliterash.sushi.cartography.sdk.client.init;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import ru.spliterash.sushi.cartography.sdk.client.FeignCartographyClient;
import ru.spliterash.sushi.cartography.sdk.resource.init.EnableCartographyExceptionHandle;
import ru.spliterash.sushi.exceptionHandle.client.init.EnableSushiExceptionClientDecoder;

@EnableCartographyExceptionHandle
@EnableSushiExceptionClientDecoder
@ComponentScan("ru.spliterash.sushi.cartography.sdk.client")
@EnableFeignClients(clients = FeignCartographyClient.class)
class CartographyClientConfiguration {
}
