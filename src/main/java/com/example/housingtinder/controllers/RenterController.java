package com.example.housingtinder.controllers;

import com.example.housingtinder.entyties.renter.Characteristics;
import com.example.housingtinder.entyties.renter.Match;
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

    List<Renter> renters = null;
    List<Match> matches = null;
    @RequestMapping
    public String index(Model model){
        return "index1.mustache";
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


        return "index1";
    }

    @GetMapping(value = "/user")
    public String getUser1(Model model){

        if(renters == null){
            renters = renterService.getRenters();
        }
        var renter = renters.get(0);
        var renter2 = renters.get(0);
        //public User(String name, int age, String gender, int adult_count, int child_count, String description, String image)
        User users = new User(renter.getName(), renter.getAge(), "M", renter.getAdultCount(), renter.getChildCount(), renter.getDescription(), renter.getPhoto());
//        Renter user = renterService.getRenters().get(id);
        User users1 = new User(renter2.getName(), renter2.getAge(), "M", renter2.getAdultCount(), renter2.getChildCount(), renter2.getDescription(), renter2.getPhoto());
        model.addAttribute("users", users);
        model.addAttribute("users1", users1);

        return "index";
    }

    @GetMapping(value = "/SwipeToLeft")
    public String swipeToLeft(){

        if(renters != null) {
            renters.add(renters.get(0));
            renters.remove(renters.get(0));
        }
        return "redirect:/user";
    }

    @GetMapping(value = "/SwipeToRight")
    public String swipeToRight(){
        if(renters.get(0).getId() == 100){
            if(renters != null){
                renters.add(renters.get(0));
                renters.remove(renters.get(0));
            }
            return "redirect:/chat";
        } else {
            return "redirect:/SwipeToLeft";
        }
    }

//    @GetMapping(value = "/chat")
//    public String chat(){
//
//    }
}
