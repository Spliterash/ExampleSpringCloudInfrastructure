package ru.spliterash.sushi.cartography.sdk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("${services.cartography}")
public interface SushiCartographyEndpoints {
    @GetMapping("/api/v1/suggest")
    SuggestResponse suggest(@RequestParam("query") String query);
}
