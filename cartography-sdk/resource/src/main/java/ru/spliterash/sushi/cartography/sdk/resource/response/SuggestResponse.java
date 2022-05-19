package ru.spliterash.sushi.cartography.sdk.resource.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SuggestResponse {
    private String city;
    private String street;
    private String house;

    @Override
    public String toString() {
        return "SuggestResponse{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
