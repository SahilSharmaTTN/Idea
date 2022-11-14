package com.sahil.SpringSecurityAssignment.controller;


import com.sahil.SpringSecurityAssignment.enitites.User;
import com.sahil.SpringSecurityAssignment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hi(){
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye";
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
