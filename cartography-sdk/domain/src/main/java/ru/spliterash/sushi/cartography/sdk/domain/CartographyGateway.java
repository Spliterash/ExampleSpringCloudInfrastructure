package ru.spliterash.sushi.cartography.sdk.domain;

import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyAddressNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyCityNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyUnavailableException;
import ru.spliterash.sushi.cartography.sdk.domain.output.SuggestResult;

public interface CartographyGateway {
    SuggestResult suggest(String query) throws CartographyCityNotFoundException, CartographyUnavailableException, CartographyAddressNotFoundException;
}
