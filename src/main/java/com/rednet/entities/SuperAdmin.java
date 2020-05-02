package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "super_admin", schema = "rednet", catalog = "")
public class SuperAdmin {
    private int id;
    private int personId;
    private Person personByPersonId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SuperAdmin that = (SuperAdmin) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
