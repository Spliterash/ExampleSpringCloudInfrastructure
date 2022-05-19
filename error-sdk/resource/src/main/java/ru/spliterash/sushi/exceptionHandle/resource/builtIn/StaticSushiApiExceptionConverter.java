package ru.spliterash.sushi.exceptionHandle.resource.builtIn;

import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;

public abstract class StaticSushiApiExceptionConverter<DOMAIN extends SushiDomainException> extends AbstractSushiApiExceptionConverter<DOMAIN, Void> {
    protected final DOMAIN exception;

    public StaticSushiApiExceptionConverter(String domain, String reason, DOMAIN exception) {
        super(domain, reason);
        this.exception = exception;
    }

    @Override
    public DOMAIN readResponse(Void response) {
        return exception;
    }

    @Override
    public Void writeResponse(DOMAIN exception) {
        return null;
    }
}
