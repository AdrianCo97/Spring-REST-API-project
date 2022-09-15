package com.example.Spring.REST.API.projekt.user.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "firstname can't be empty")
    private String firstname;

    @NotBlank(message = "lastname can't be empty")
    private String lastname;

    @NotBlank(message = "email can't be empty")
    private String email;

    @NotBlank(message = "password can't be empty")
    private String password;

    private LocalDate createdAtDate = LocalDate.now();

    private LocalTime createdAtTime = LocalTime.now();

    public UserModel(){}

    public UserModel(String firstname, String lastname, String email, String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedAtDate() {
        return createdAtDate;
    }

    public LocalTime getCreatedAtTime() {
        return createdAtTime;
    }
}
