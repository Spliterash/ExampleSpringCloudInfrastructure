package ru.spliterash.sushi.cartography.sdk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.spliterash.sushi.cartography.sdk.domain.CartographyGateway;
import ru.spliterash.sushi.cartography.sdk.resource.CartographyResource;
import ru.spliterash.sushi.cartography.sdk.resource.mapper.CartographyApiMapper;
import ru.spliterash.sushi.cartography.sdk.resource.response.SuggestResponse;

@RestController
@RequiredArgsConstructor
public class CartographyController implements CartographyResource {
    private final CartographyGateway gateway;
    private final CartographyApiMapper mapper;

    @Override
    public SuggestResponse suggest(String query) {
        return mapper.map(gateway.suggest(query));
    }
}
