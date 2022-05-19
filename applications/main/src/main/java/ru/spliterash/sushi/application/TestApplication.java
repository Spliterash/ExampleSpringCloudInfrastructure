package ru.spliterash.sushi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ru.spliterash")
@EnableFeignClients("ru.spliterash")

/*@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.application")
@EnableCartographyClient
@EnableSushiExceptionHandler*/
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
