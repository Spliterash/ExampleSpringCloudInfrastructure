package ru.spliterash.sushi.cartography.sdk.domain.exceptions;

import lombok.Getter;
import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;

@Getter
public class CartographyCityNotFoundException extends SushiDomainException {
    private final String cityName;

    public CartographyCityNotFoundException(String cityName) {
        super(Domain.DOMAIN, CartographyErrorReason.CITY_NOT_FOUND, "City " + cityName + " not found");
        this.cityName = cityName;
    }
}
