package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErmiriController {


    @RequestMapping("/ermiri")
    public String elmiri(){
        return "ermiri.html";
    }
}
