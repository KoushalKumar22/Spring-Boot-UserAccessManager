package com.SpringAPI.Login_SignUp.Repository;

import com.SpringAPI.Login_SignUp.Entity.LoginPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LoginPageRepository extends JpaRepository<LoginPage,String> {

    Optional<LoginPage> findByUsername(String username);
}
