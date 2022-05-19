package ru.spliterash.sushi.cartography.sdk.domain.output;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SuggestResult {
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
