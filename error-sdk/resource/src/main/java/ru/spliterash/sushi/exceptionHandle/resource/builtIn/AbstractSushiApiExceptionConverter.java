package ru.spliterash.sushi.exceptionHandle.resource.builtIn;

import lombok.Getter;
import net.jodah.typetools.TypeResolver;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;
import ru.spliterash.sushi.exceptionHandle.resource.SushiApiExceptionConverter;

@Getter
public abstract class AbstractSushiApiExceptionConverter<DOMAIN extends SushiDomainException, DATA> implements SushiApiExceptionConverter<DOMAIN, DATA> {
    protected final String domain;
    protected final String reason;

    protected final Class<DOMAIN> domainExceptionType;
    protected final Class<DATA> dataType;

    @SuppressWarnings("unchecked")
    public AbstractSushiApiExceptionConverter(String domain, String reason) {
        this.domain = domain;
        this.reason = reason;

        Class<?>[] classes = TypeResolver.resolveRawArguments(AbstractSushiApiExceptionConverter.class, getClass());

        domainExceptionType = (Class<DOMAIN>) classes[0];
        dataType = (Class<DATA>) classes[1];
    }
}
