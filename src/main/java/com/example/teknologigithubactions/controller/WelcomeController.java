package com.example.teknologigithubactions.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController
{
    @GetMapping("/welcome")
    public ModelAndView welcome()
    {
        ModelAndView mav = new ModelAndView();
        String welcome = "Welcome";
        mav.addObject("welcome", welcome);
        return mav;
    }
}
