package com.SpringAPI.Login_SignUp.Repository;

import com.SpringAPI.Login_SignUp.Entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Integer> {
}
