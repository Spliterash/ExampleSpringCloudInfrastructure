package ru.spliterash.sushi.cartography.sdk.resource.exceptionConverters.cityNotFound;

import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyCityNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyErrorReason;
import ru.spliterash.sushi.exceptionHandle.resource.builtIn.AbstractSushiApiExceptionConverter;
@Component
public class CartographyCityNotFoundExceptionConverter extends AbstractSushiApiExceptionConverter<CartographyCityNotFoundException, CityNotFoundData> {

    public CartographyCityNotFoundExceptionConverter() {
        super(Domain.DOMAIN, CartographyErrorReason.CITY_NOT_FOUND);
    }

    @Override
    public CartographyCityNotFoundException readResponse(CityNotFoundData response) {
        return new CartographyCityNotFoundException(response.getCityName());
    }

    @Override
    public CityNotFoundData writeResponse(CartographyCityNotFoundException exception) {
        return new CityNotFoundData(exception.getCityName());
    }
}
