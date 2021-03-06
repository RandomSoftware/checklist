package ru.randomsoftware.checklist.api;

import org.springframework.http.HttpStatus;

public class BaseResponse {

    private final HttpStatus status;

    public BaseResponse(HttpStatus status) {
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
