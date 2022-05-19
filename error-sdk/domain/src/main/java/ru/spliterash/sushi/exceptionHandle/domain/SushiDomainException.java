package ru.spliterash.sushi.exceptionHandle.domain;

import lombok.Getter;

@Getter
public abstract class SushiDomainException extends RuntimeException {
    private final String domain;
    private final String reason;
    private final String details;

    public SushiDomainException(String domain, String reason, String details, Throwable cause) {
        super(details, cause);
        this.domain = domain;
        this.reason = reason;
        this.details = details;
    }

    public SushiDomainException(String domain, String reason, String details) {
        super(details);
        this.domain = domain;
        this.reason = reason;
        this.details = details;
    }
}
