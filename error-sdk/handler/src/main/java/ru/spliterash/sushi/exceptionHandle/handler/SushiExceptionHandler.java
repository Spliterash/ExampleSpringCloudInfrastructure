package ru.spliterash.sushi.exceptionHandle.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.spliterash.sushi.exceptionHandle.domain.SushiDomainException;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionResponse;
import ru.spliterash.sushi.exceptionHandle.resource.SushiExceptionService;

@RequiredArgsConstructor
@RestControllerAdvice
public class SushiExceptionHandler {
    private final SushiExceptionService sushiExceptionService;

    @ExceptionHandler(SushiDomainException.class)
    public ResponseEntity<SushiExceptionResponse> handle(SushiDomainException exception) {
        return ResponseEntity.badRequest().body(sushiExceptionService.convert(exception));
    }
}
