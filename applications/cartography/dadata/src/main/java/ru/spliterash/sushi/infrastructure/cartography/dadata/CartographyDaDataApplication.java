package ru.spliterash.sushi.infrastructure.cartography.dadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.infrastructure.cartography.dadata")
public class CartographyDaDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartographyDaDataApplication.class, args);
    }
}
