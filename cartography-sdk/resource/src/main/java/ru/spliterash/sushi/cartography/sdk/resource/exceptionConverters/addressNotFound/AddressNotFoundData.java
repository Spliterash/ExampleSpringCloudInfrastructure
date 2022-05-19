package ru.spliterash.sushi.cartography.sdk.resource.exceptionConverters.addressNotFound;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressNotFoundData {
    private String notFoundedQuery;
}
