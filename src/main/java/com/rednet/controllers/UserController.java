package com.rednet.controllers;

import com.rednet.dao.UserDAO;
import com.rednet.entities.Person;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    private UserDAO userDAO;

    @PostMapping("/login")
    public ResponseEntity<Person> login(HttpServletRequest request, HttpServletResponse response) {
        try {
            Person person;
            //username = request.getParameter("username");
            //password = request.getParameter("password");
            person = userDAO.authenticate(username,password);
            return new ResponseEntity<Person>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
