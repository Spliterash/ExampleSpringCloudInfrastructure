package ru.spliterash.sushi.infrastructure.cartography.yandex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ru.spliterash.sushi.cartography.sdk.controller.init.EnableCartographyController;
import ru.spliterash.sushi.exceptionHandle.handler.init.EnableSushiExceptionHandler;

@EnableDiscoveryClient
@EnableCartographyController
@EnableSushiExceptionHandler
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.infrastructure.cartography.yandex")
public class CartographyYandexApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartographyYandexApplication.class, args);
    }
}
