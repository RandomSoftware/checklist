package ru.randomsoftware.checklist.api;

import org.springframework.http.HttpStatus;

public class ErrorResponse extends BaseResponse {

    private final String message;

    public ErrorResponse(String message, HttpStatus code) {
        super(code);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
