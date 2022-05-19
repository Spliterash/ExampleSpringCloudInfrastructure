package ru.spliterash.sushi.cartography.sdk.resource.exceptionConverters.addressNotFound;

import org.springframework.stereotype.Component;
import ru.spliterash.sushi.cartography.sdk.domain.Domain;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyAddressNotFoundException;
import ru.spliterash.sushi.cartography.sdk.domain.exceptions.CartographyErrorReason;
import ru.spliterash.sushi.exceptionHandle.resource.builtIn.AbstractSushiApiExceptionConverter;

@Component
public class CartographyAddressNotFoundExceptionConverter extends AbstractSushiApiExceptionConverter<CartographyAddressNotFoundException, AddressNotFoundData> {
    public CartographyAddressNotFoundExceptionConverter() {
        super(Domain.DOMAIN, CartographyErrorReason.ADDRESS_NOT_FOUND);
    }

    @Override
    public CartographyAddressNotFoundException readResponse(AddressNotFoundData response) {
        return new CartographyAddressNotFoundException(response.getNotFoundedQuery());
    }

    @Override
    public AddressNotFoundData writeResponse(CartographyAddressNotFoundException exception) {
        return new AddressNotFoundData(exception.getNotFoundedQuery());
    }
}
