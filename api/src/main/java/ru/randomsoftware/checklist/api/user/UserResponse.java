package ru.randomsoftware.checklist.api.user;

import org.springframework.http.HttpStatus;
import ru.randomsoftware.checklist.api.BaseResponse;

public class UserResponse extends BaseResponse {

    private final String username;
    private final String token;

    public UserResponse(String username, String token, HttpStatus code) {
        super(code);
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }

}
