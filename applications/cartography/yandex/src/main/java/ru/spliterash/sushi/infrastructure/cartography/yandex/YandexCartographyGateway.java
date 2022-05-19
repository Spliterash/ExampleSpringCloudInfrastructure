package ru.spliterash.sushi.infrastructure.cartography.yandex;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.spliterash.sushi.cartography.sdk.domain.CartographyGateway;
import ru.spliterash.sushi.cartography.sdk.domain.output.SuggestResult;

@RestController
@RequiredArgsConstructor
public class YandexCartographyGateway implements CartographyGateway {
    @Override
    public SuggestResult suggest(String query) {
        return SuggestResult.builder()
                .city("yandex")
                .house("yandex")
                .street("yandex")
                .build();
    }
}
