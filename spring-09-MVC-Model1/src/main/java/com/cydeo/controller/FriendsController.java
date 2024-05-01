package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Friends;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendsController {
    @RequestMapping("/friends")
    public String myFriends(Model model){

        List<Friends> list = new ArrayList<>();
        list.add(new Friends("Fanol","Jakupi",34, Gender.MALE));
        list.add(new Friends("Bardh","Jakupi",32,Gender.MALE));
        list.add(new Friends("Granit","Zylfiu",26,Gender.MALE));
        model.addAttribute("friends",list);


        return "friends/friends-info";
    }
}
