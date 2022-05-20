package ru.spliterash.sushi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ru.spliterash.sushi.cartography.sdk.client.init.EnableCartographyClient;
import ru.spliterash.sushi.exceptionHandle.handler.init.EnableSushiExceptionHandler;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.application")
@EnableCartographyClient
@EnableSushiExceptionHandler
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
