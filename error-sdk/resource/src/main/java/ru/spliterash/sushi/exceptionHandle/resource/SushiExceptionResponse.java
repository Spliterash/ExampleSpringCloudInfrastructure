package ru.spliterash.sushi.exceptionHandle.resource;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public final class SushiExceptionResponse {
    private String domain;
    private String reason;
    private String details;
    /**
     * Какая нибудь дополнительная информация, относящаяся только к этой связке domain и reason
     */
    private Map<String, Object> data;
}
