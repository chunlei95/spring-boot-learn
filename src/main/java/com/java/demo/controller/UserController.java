package com.java.demo.controller;

import com.java.demo.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzmeasy
 * @since 1.0
 **/
@RestController
public class UserController {

    @PostMapping("/user/register")
    public void createUser(@Validated @RequestBody User user) {
        User newUser = new User();
        newUser = user;
    }

}
