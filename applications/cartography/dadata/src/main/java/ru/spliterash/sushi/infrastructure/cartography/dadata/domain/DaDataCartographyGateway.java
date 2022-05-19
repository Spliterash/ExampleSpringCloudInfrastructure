package ru.spliterash.sushi.infrastructure.cartography.dadata.domain;

import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.CartographyGateway;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyAddressNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyCityNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.output.SuggestResult;

// Давайте представим, как будто бы это домен слой, что бы я в этом проекте его не описывал
@Component
public class DaDataCartographyGateway implements CartographyGateway {
    @Override
    public SuggestResult suggest(String query) {
        switch (query) {
            case "city":
                throw new CartographyCityNotFoundException("Moscow");
            case "query":
                throw new CartographyAddressNotFoundException("Query");
            default:
                return SuggestResult.builder().city("DaData").house("DaData").street("DaData").build();
        }
    }
}
