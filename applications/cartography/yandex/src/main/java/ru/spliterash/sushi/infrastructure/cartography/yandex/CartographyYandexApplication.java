package ru.spliterash.sushi.infrastructure.cartography.yandex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.infrastructure.cartography.yandex")
public class CartographyYandexApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartographyYandexApplication.class, args);
    }
}
