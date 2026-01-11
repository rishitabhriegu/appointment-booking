package com.appointment.bookAppointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

//    @PostMapping("/login")
//    public String handleLogin(
//            @RequestParam String username,
//            @RequestParam String password,
//            Model model) {
//
//        // TEMP logic (replace with DB check later)
//        if ("Rishita".equals(username) && "rish".equals(password)) {
//            return "redirect:/";
//        }
//
//        model.addAttribute("error", "Invalid username or password");
//        return "login";
//    }
}
