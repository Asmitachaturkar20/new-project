package com.User_data.info.controller;


import com.User_data.info.model.User;
import com.User_data.info.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Mycontroller {
    @Autowired
    UserService userService;
    @GetMapping("/h")
    public String home(Model model){
        model.addAttribute("users",userService.getUsers());

        return "index";
    }
}
