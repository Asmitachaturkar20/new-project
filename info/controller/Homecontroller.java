package com.User_data.info.controller;

import com.User_data.info.model.User;
import com.User_data.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class Homecontroller {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public List<User>home(){
        return userService.getUsers();
    }
    @GetMapping("/user/{id}")
    public Optional<User> FinfById(@PathVariable Long id){
        return userService.findByIb(id);
    }
    @DeleteMapping("/user/{id}")
    public void Deleteuser(@PathVariable Long id){
        userService.DeleteById(id);
    }
    @PostMapping("/add")
    public void adduser(@RequestBody User user){
        userService.Save(user);
    }
    @PutMapping("/user/{id}")
    public void Updateuser(@RequestBody User user,@PathVariable Long id){
        userService.Update(user,id);
    }
}
