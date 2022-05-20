package ru.spliterash.sushi.infrastructure.cartography.dadata.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ru.spliterash.sushi.cartography.sdk.controller.init.EnableCartographyController;
import ru.spliterash.sushi.exceptionHandle.handler.init.EnableSushiExceptionHandler;

// Ну тут понятно
@EnableDiscoveryClient
// Включает контроллер картографии, который просто обернёт бин CartographyGateway в контроллер
@EnableCartographyController
// Включает навороченную обработку ошибок
@EnableSushiExceptionHandler
// Тут тоже понятно, так же прошу заметить, что я не сканю корневой проект, ибо предпочитаю включать чо надо явно(то есть аннотациями как сверху)
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.infrastructure.cartography.dadata")
public class CartographyDaDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartographyDaDataApplication.class, args);
    }
}
