package com.neu.cloudapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    private String field;

    public BadRequestException(String message, String field) {
        super(message);
        this.field = field;
    }
    public String getField() {
        return this.field;
    }

}
