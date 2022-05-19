package ru.spliterash.sushi.application;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.CartographyGateway;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final ApplicationContext context;
    private final CartographyGateway gateway;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(gateway.suggest("city"));
    }
}
