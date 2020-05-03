package com.rednet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {
    public Person findPersonByUsernameAndPassword(String username, String password);
}
