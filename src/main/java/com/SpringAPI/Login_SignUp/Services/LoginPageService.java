package com.SpringAPI.Login_SignUp.Services;

import com.SpringAPI.Login_SignUp.Entity.LoginPage;
import com.SpringAPI.Login_SignUp.Repository.LoginPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginPageService {

    @Autowired
    LoginPageRepository lrepo;

    public boolean validateUser(String username,String password){
        Optional<LoginPage> login=lrepo.findByUsername(username);
        return login.isPresent() && login.get().getPassword().equals(password);
    }
}
