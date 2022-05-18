package ru.spliterash.sushi.infrastructure.cartography.dadata;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.spliterash.sushi.cartography.sdk.SuggestResponse;
import ru.spliterash.sushi.cartography.sdk.SushiCartographyEndpoints;

@RestController
@RequiredArgsConstructor
public class DaDataCartographyController implements SushiCartographyEndpoints {

    @Override
    public SuggestResponse suggest(String query) {
        return SuggestResponse.builder()
                .city("DaData")
                .house("DaData")
                .street("DaData")
                .build();
    }
}
