package ru.spliterash.sushi.exceptionHandle.resource;

import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;

public interface SushiApiExceptionConverter<DOMAIN extends SushiDomainException, DATA> {
    String getDomain();

    String getReason();


    DOMAIN readResponse(DATA response);

    /**
     * Может вернуть null
     */
    DATA writeResponse(DOMAIN exception);


    Class<DOMAIN> getDomainExceptionType();

    Class<DATA> getDataType();
}
