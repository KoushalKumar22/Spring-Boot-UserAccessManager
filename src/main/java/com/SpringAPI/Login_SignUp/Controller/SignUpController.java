package com.SpringAPI.Login_SignUp.Controller;

import com.SpringAPI.Login_SignUp.Entity.SignUp;
import com.SpringAPI.Login_SignUp.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SignUpController {

    @Autowired
    SignUpRepository srepo;

    @GetMapping("/register")
    public String register() {
        return "SignUp";
    }

    @PostMapping("/register")
    public String signup(@ModelAttribute SignUp signUp, Model model) {
        System.out.println(signUp.toString());
        SignUp savedSignUp = srepo.save(signUp);
        model.addAttribute("Message",savedSignUp.getName() + " Welcome");
        return "Welcome";
    }
}
