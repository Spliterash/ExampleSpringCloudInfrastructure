package ru.spliterash.sushi.infrastructure.cartography.dadata.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// Ну тут понятно
@EnableDiscoveryClient
/*// Включает контроллер картографии, который просто обернёт бин CartographyGateway в контроллер
@EnableCartographyController
// Включает навороченную обработку ошибок
@EnableSushiExceptionHandler
// Тут тоже понятно, так же прошу заметить, что я не сканю корневой проект, ибо предпочитаю включать чо надо явно(то есть аннотациями как сверху)
@SpringBootApplication(scanBasePackages = "ru.spliterash.sushi.infrastructure.cartography.dadata")*/



// Я не понимаю, по какой причине, мои аннотации не работают, он как будто бы @Import ставит приоритет выше,
// чем ComponentScan, те не находит то, что должно найтись при сканировании
@SpringBootApplication(scanBasePackages = "ru.spliterash")
public class CartographyDaDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartographyDaDataApplication.class, args);
    }
}
