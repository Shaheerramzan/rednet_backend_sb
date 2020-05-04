package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "super_admin", schema = "rednet")
public class SuperAdmin {
    private int personId;
    private Person personByPersonId;

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

        SuperAdmin that = (SuperAdmin) o;

        return personId == that.personId;
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
}
