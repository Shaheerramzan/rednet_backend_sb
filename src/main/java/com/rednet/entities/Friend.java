package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Friend {
    private int friendId;
    private Person personByPersonOne;
    private Person personByPersonTwo;

    @Id
    @Column(name = "friend_id", nullable = false)
    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return friendId == friend.friendId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendId);
    }

    @ManyToOne
    @JoinColumn(name = "person_one", referencedColumnName = "person_id", nullable = false)
    public Person getPersonByPersonOne() {
        return personByPersonOne;
    }

    public void setPersonByPersonOne(Person personByPersonOne) {
        this.personByPersonOne = personByPersonOne;
    }

    @ManyToOne
    @JoinColumn(name = "person_two", referencedColumnName = "person_id", nullable = false)
    public Person getPersonByPersonTwo() {
        return personByPersonTwo;
    }

    public void setPersonByPersonTwo(Person personByPersonTwo) {
        this.personByPersonTwo = personByPersonTwo;
    }
}
