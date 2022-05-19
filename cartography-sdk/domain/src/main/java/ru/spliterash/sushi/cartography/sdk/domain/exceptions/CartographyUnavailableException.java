package ru.spliterash.sushi.cartography.sdk.domain.exceptions;

import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;

public class CartographyUnavailableException extends SushiDomainException {
    public CartographyUnavailableException() {
        super(Domain.DOMAIN, CartographyErrorReason.UNAVAILABLE, "Cartography service not available");
    }
}
