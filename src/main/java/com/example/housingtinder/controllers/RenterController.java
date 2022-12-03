package com.example.housingtinder.controllers;

import ch.qos.logback.core.model.Model;
import com.example.housingtinder.entyties.renter.Renter;
import com.example.housingtinder.services.IRenterService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@Scope(WebApplicationContext.SCOPE_SESSION)
public class RenterController {
    private IRenterService renterService;

    @RequestMapping
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/showRenters")
    public ModelAndView showRenters(){
        List<Renter> renters = renterService.getRenters();

        Map<String, Object> params = new HashMap<>();
        params.put("renters", renters);

        return new ModelAndView("showRenters", params);
    }
}
