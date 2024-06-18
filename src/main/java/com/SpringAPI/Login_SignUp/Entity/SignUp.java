package com.SpringAPI.Login_SignUp.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "UserAccessManager")
public class SignUp {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name",length = 50)
    @NotEmpty(message = "Name Cannot Be Empty")
    private String name;

    @Column(name = "Username",length = 50,unique = true)
    @NotEmpty(message = "UserName Cannot Be Empty")
    private String username;

    @Column(name = "EmailId",unique = true)
    @NotEmpty(message = "Email Is Required")
    @Pattern(regexp = "^[a-z0-9@.C]+$", message = "Invalid email format")
    private String emailid;

    @Column(name = "PhoneNo",unique = true,length = 10)
    @NotNull(message = "Phone No Is Required")
    private Long phnumber;

    @Column(name = "Password")
    @NotEmpty(message = "password is Required")
    private String password;

    @Column(name = "ConfirmPassword")
    private String cpassword;

    @Column(name = "City")
    private String city;

    @Column(name = "Address")
    private String address;

    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public SignUp() {
    }

    public SignUp(int id, String name, String username, String emailid, Long phnumber, String password, String cpassword, String city, String address, Gender gender) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.emailid = emailid;
        this.phnumber = phnumber;
        this.password = password;
        this.cpassword = cpassword;
        this.city = city;
        this.address = address;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Long getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(Long phnumber) {
        this.phnumber = phnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phnumber=" + phnumber +
                ", password='" + password + '\'' +
                ", cpassword='" + cpassword + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
