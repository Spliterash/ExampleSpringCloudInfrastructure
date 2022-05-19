package ru.spliterash.sushi.cartography.sdk.domain.exceptions;

import lombok.Getter;
import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;

@Getter
public class CartographyAddressNotFoundException extends SushiDomainException {
    private final String notFoundedQuery;

    public CartographyAddressNotFoundException(String notFoundedQuery) {
        super(Domain.DOMAIN, CartographyErrorReason.ADDRESS_NOT_FOUND, "Address not found by query " + notFoundedQuery);
        this.notFoundedQuery = notFoundedQuery;
    }
}
