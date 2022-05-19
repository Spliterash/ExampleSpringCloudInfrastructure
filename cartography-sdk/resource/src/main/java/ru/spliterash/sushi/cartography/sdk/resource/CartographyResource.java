package ru.spliterash.sushi.cartography.sdk.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.spliterash.sushi.cartography.sdk.resource.response.SuggestResponse;

public interface CartographyResource {
    @GetMapping("/api/v1/suggest")
    SuggestResponse suggest(@RequestParam("query") String query);
}