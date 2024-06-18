package com.SpringAPI.Login_SignUp.Controller;

import com.SpringAPI.Login_SignUp.Entity.SignUp;
import com.SpringAPI.Login_SignUp.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class SignUpController {

    @Autowired
    SignUpRepository srepo;

    @GetMapping("/")
    public String test() {
        return "signup";
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        // Add logic to prepare the registration form
        return "signup"; // Return the name of the Thymeleaf template for the signup form
    }


    @PostMapping("/register")
    public String signup(@ModelAttribute SignUp signUp, Model model) {
        System.out.println(signUp.toString());
        SignUp savedSignUp = srepo.save(signUp);
        model.addAttribute("Message",savedSignUp.getName() + " welcome");
        return "welcome";
    }
}
