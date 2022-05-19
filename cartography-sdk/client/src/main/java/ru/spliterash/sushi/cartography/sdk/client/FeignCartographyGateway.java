package ru.spliterash.sushi.cartography.sdk.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.CartographyGateway;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyAddressNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyCityNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyUnavailableException;
import ru.spliterash.sushi.cartography.sdk.domain.output.SuggestResult;
import ru.spliterash.sushi.cartography.sdk.resource.mapper.CartographyApiMapper;
import ru.spliterash.sushi.cartography.sdk.resource.response.SuggestResponse;

@Component
@RequiredArgsConstructor
public class FeignCartographyGateway implements CartographyGateway {
    private final FeignCartographyClient feignCartographyClient;
    private final CartographyApiMapper mapper;

    @Override
    public SuggestResult suggest(String query) throws CartographyCityNotFoundException, CartographyUnavailableException, CartographyAddressNotFoundException {
        SuggestResponse suggest = feignCartographyClient.suggest(query);

        return mapper.map(suggest);
    }
}
