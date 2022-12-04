package com.example.housingtinder.controllers;

import com.example.housingtinder.entyties.renter.Characteristics;
import com.example.housingtinder.entyties.renter.Renter;
import com.example.housingtinder.entyties.renter.User;
import com.example.housingtinder.services.IRenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope(WebApplicationContext.SCOPE_SESSION)
public class RenterController {
    @Autowired
    private IRenterService renterService;

    @RequestMapping
    public String index(Model model){
        return "index.mustache";
    }

    @RequestMapping("/showRenters")
    public ModelAndView showRenters(){
        List<Renter> renters = renterService.getRenters();

        Map<String, Object> params = new HashMap<>();
        params.put("renters", renters);

        return new ModelAndView("showRenters", params);
    }

    @GetMapping(value = "/users")
    public String getUser(Model model){
        var chr = new Characteristics(0, "student", "student");
        ArrayList<Characteristics> characteristics = new ArrayList<>();
        characteristics.add(chr);
        var users = renterService.getRenters();

        model.addAttribute("users", users);


        return "index";
    }

    @GetMapping(value = "/user")
    public String getUser1(Model model){

        //public User(String name, int age, String gender, int adult_count, int child_count, String description, String image)
        User users = new User("Vasyl", 20, "M", 1, 0, "sfsdfsdf", "sdfsdfsdf");

        model.addAttribute("users", users);


        return "index";
    }



}
