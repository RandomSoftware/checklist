package ru.randomsoftware.checklist.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.randomsoftware.checklist.api.BaseResponse;
import ru.randomsoftware.checklist.dao.entity.User;
import ru.randomsoftware.checklist.dao.entity.UserRepository;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @PutMapping
    public BaseResponse createUser(@RequestBody UserRequest request) {
        User user = userRepository.save(request.asUser());
        return new UserResponse(user.username, "", HttpStatus.OK);
    }

}
