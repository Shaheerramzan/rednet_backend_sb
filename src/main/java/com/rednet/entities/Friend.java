package com.rednet.entities;

import javax.persistence.*;

@Entity
public class Friend {
    private int personId;
    private Person personByPersonId;
    private Person personByFriendId;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Friend friend = (Friend) o;

        return personId == friend.personId;
    }

    @Override
    public int hashCode() {
        return personId;
    }

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }

    @ManyToOne
    @JoinColumn(name = "friend_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByFriendId() {
        return personByFriendId;
    }

    public void setPersonByFriendId(Person personByFriendId) {
        this.personByFriendId = personByFriendId;
    }
}
