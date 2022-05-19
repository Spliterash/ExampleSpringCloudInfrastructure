package ru.spliterash.sushi.exceptionHandle.domain;

public class UnknownSushiDomainException extends SushiDomainException {
    public UnknownSushiDomainException(String domain, String reason, String details) {
        super(domain, reason, details);
    }
}
