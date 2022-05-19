package ru.spliterash.sushi.cartography.sdk.client;

import org.springframework.cloud.openfeign.FeignClient;
import ru.spliterash.sushi.cartography.sdk.resource.CartographyResource;

@FeignClient("${services.cartography}")
public interface FeignCartographyClient extends CartographyResource {
}
