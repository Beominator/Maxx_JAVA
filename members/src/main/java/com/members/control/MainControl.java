package com.members.control;

import org.springframework.web.bind.annotation.GetMapping;

public class MainControl {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
