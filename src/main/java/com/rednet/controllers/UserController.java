package com.rednet.controllers;

import com.rednet.dao.UserDAO;
import com.rednet.entities.ConveyanceProvider;
import com.rednet.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.NoSuchElementException;

@RestController
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping("/login")
    public ResponseEntity<Person> login(HttpServletRequest request, HttpServletResponse response) {
        try {
            Person person;
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            person = userDAO.authenticate(username,password);
            Collection <ConveyanceProvider> cp = person.getConveyanceProvidersByPersonId();
            request.getSession().setAttribute("user", person);
            return new ResponseEntity<>(person, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
