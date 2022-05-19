package ru.spliterash.sushi.cartography.sdk.resource.exceptionConverters.serviceUnavailable;

import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyErrorReason;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyUnavailableException;
import ru.spliterash.sushi.exceptionHandle.resource.builtIn.StaticSushiApiExceptionConverter;

@Component
public class CartographyUnavailableExceptionConverter extends StaticSushiApiExceptionConverter<CartographyUnavailableException> {
    public CartographyUnavailableExceptionConverter() {
        super(Domain.DOMAIN, CartographyErrorReason.UNAVAILABLE, new CartographyUnavailableException());
    }
}
