package com.lbccc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String home(Model model) {
//        model.addAttribute("welcomeMessage", "Welcome to our home page!");
        return "home";
    }
}