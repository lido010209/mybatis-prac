package com.example.mybatis.logUp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogUpController {
    private final LogUpRepository repository;
    public LogUpController(LogUpRepository repository) {
        this.repository = repository;
    }

    @GetMapping("log-up")
    public String lopUp(){
        return "user/logUp.html";
    }
    @PostMapping("/create-user")
    public String createUser(LogUp user){
        repository.createUser(user);
        return "redirect:/manage-user";
    }

}
