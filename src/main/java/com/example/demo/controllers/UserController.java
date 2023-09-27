package com.example.demo.controllers;

import com.example.demo.models.Users;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<Users> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping()
    public Users createUser(@RequestBody Users user){
        return userService.createUser(user);
    }
    @DeleteMapping
    public String deleteUserById(@RequestParam Integer id_user){
        userService.deleteUser(id_user);
        return "Ha eliminado el usuario con id: " + id_user;
    };
}
