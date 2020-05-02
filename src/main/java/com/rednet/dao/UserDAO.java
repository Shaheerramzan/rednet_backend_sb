package com.rednet.dao;

import com.rednet.entities.Person;
import com.rednet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    public Person authenticate(String username, String password)
    {
        return userRepository.findPersonByUsernameAndPassword(username,password);
    }
}
