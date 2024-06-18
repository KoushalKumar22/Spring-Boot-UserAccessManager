package com.SpringAPI.Login_SignUp.Controller;

import com.SpringAPI.Login_SignUp.Entity.LoginPage;
import com.SpringAPI.Login_SignUp.Services.LoginPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class LoginPageController {

    @Autowired
    LoginPageService lservice;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {

        boolean isValidUser = lservice.validateUser(username, password);
        if (isValidUser) {
            model.addAttribute("message", "Login Successfully!");
            return "welcome";
        } else {
            model.addAttribute("message", "Invalid UserName Or Password");
            return "login";
        }
    }
}
