package com.example.housingtinder.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

@Controller
@Scope(WebApplicationContext.SCOPE_SESSION)
public class DataController {

    @GetMapping("/ping")
    public String pong(Model model){
        model.addAttribute("pong", "pong");

        return "index";
    }

}
