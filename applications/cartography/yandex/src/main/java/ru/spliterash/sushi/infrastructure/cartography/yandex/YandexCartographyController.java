package ru.spliterash.sushi.infrastructure.cartography.yandex;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.spliterash.sushi.cartography.sdk.SuggestResponse;
import ru.spliterash.sushi.cartography.sdk.SushiCartographyEndpoints;

@RestController
@RequiredArgsConstructor
public class YandexCartographyController implements SushiCartographyEndpoints {

    @Override
    public SuggestResponse suggest(String query) {
        return SuggestResponse.builder()
                .city("yandex")
                .house("yandex")
                .street("yandex")
                .build();
    }
}
