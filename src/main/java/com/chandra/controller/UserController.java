package com.chandra.controller;

import com.chandra.binding.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    public UserController(){
        System.out.println("user controller constructor called !!!!!");
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        User u1 = new User(101, "Ashok", "ashok@gmail.com");
        User u2 = new User(102, "Raju", "raju@gmail.com");
        User u3 = new User(103, "Rani", "rani@gmail.com");
        List<User> usersList = Arrays.asList(u1, u2, u3);
        model.addAttribute("usersData", usersList);
        return "view-users";
    } 
    @GetMapping("/user")
    public String getUserData(Model model){
        User userObj=new User(101,"Chandra","chandra@gmail.com");
        model.addAttribute("user",userObj);
        return "user-data";
    }

    @GetMapping("/email")
    public String getUserEmail(Model model){
        model.addAttribute("name","chandra@gmail.com");
        return "Index";//view name ---html file name
    }

    @GetMapping("/name")
    public ModelAndView getUserController(){
        ModelAndView mav =new ModelAndView();
        //set data to the model
        mav.addObject("name","Chandra");
        //set view name
        mav.setViewName("index");
        return mav;

    }
}
