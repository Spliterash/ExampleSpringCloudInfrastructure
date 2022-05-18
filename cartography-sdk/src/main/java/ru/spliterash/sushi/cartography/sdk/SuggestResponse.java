package ru.spliterash.sushi.cartography.sdk;

import lombok.*;
import lombok.experimental.SuperBuilder;

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
