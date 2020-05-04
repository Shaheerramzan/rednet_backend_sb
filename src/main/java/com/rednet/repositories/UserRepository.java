package com.rednet.repositories;

import com.rednet.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {
    Person findPersonByUsernameAndPassword(String username, String password);
}
