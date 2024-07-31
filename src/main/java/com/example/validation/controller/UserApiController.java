package com.example.validation.controller;

import com.example.validation.model.UserRegisterRequest;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserApiController {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    @PostMapping("")
    public UserRegisterRequest register(
        @Valid()
        @RequestBody
        UserRegisterRequest userRegisterRequest
    ){
        log.info("init : {}", userRegisterRequest);

        return userRegisterRequest;
    }

}
