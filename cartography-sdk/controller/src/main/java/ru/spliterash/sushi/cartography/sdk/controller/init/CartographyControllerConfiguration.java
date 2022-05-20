package ru.spliterash.sushi.cartography.sdk.controller.init;

import org.springframework.context.annotation.ComponentScan;
import ru.spliterash.sushi.cartography.sdk.resource.init.EnableCartographyExceptionHandle;

@EnableCartographyExceptionHandle
@ComponentScan("ru.spliterash.sushi.cartography.sdk.controller")
class CartographyControllerConfiguration {
}
