package ru.spliterash.sushi.application;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.SushiCartographyEndpoints;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final SushiCartographyEndpoints client;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(client.suggest("str"));
    }
}
