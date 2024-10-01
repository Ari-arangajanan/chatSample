package com.wonder.chatSample.controller;

import com.wonder.chatSample.model.User;
import com.wonder.chatSample.service.UserService;
import com.wonder.chatSample.xmpp.XmppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/Chat")
public class CreateUserController {

    private XmppConfig xmppConfig;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        userService.save(user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.list();
    }
}
