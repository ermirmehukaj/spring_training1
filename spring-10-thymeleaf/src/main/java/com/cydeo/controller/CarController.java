package com.cydeo.controller;

import com.cydeo.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @GetMapping("/register")
    public String myCar(Model model){
        List<String> color = Arrays.asList("Red","White","Black");

        model.addAttribute("color",color);


        model.addAttribute("car", new Car());

        return "car/car-register";
    }
    @PostMapping("/confirm")
    public String myCar2(@ModelAttribute("car")  Car car){



     //   return "car/car-confirmation";
        return "redirect:/car/register";
    }
}
