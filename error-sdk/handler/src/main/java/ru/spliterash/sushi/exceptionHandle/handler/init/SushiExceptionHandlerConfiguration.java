package ru.spliterash.sushi.exceptionHandle.handler.init;

import org.springframework.context.annotation.ComponentScan;
import ru.spliterash.sushi.exceptionHandle.resource.init.EnableSushiExceptionService;

@EnableSushiExceptionService
@ComponentScan("ru.spliterash.sushi.exceptionHandle.handler")
class SushiExceptionHandlerConfiguration {
}
