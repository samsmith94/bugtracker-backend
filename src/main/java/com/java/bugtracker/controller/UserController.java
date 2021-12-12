package com.java.bugtracker.controller;

import com.java.bugtracker.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    User user = new User(1, "Szájer Jóska");

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {

        return this.user;
    }

}
