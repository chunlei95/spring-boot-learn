package com.java.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author xzmeasy
 * @since 1.0
 **/
public class User {

    @NotBlank(message = "username can't be null")
    private String username;

    @NotBlank(message = "password can't be null")
    private String password;

    @NotBlank(message = "email can't be null")
    @Email(message = "email format is not correct")
    private String email;

    @NotBlank(message = "icon can't be null")
    @URL(message = "url format is not correct")
    private String icon;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }


    public void setIcon(String icon) {
        this.icon = icon;
    }
}
