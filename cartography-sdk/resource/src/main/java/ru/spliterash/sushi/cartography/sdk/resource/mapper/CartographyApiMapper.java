package ru.spliterash.sushi.cartography.sdk.resource.mapper;

import org.mapstruct.Mapper;
import ru.spliterash.sushi.cartography.sdk.domain.output.SuggestResult;
import ru.spliterash.sushi.cartography.sdk.resource.response.SuggestResponse;

@Mapper(componentModel = "spring")
public interface CartographyApiMapper {
    SuggestResult map(SuggestResponse suggest);

    SuggestResponse map(SuggestResult suggest);
}
