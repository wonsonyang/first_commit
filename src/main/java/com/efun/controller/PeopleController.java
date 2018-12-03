package com.efun.controller;

import com.efun.pojo.People;
import com.efun.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class PeopleController {


    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/showInfo")
    public String showUserInfo(ModelMap modelMap, @RequestParam int userId) {
        System.out.println("进来了····");
        People people = peopleService.getById(userId);
        modelMap.addAttribute("people", people);
        return "showInfo";
    }


}
