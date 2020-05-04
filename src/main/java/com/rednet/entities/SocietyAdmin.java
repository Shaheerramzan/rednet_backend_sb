package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "society_admin", schema = "rednet")
public class SocietyAdmin {
    private int personId;
    private int societyId;
    private Person personByPersonId;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "society_id", nullable = false)
    public int getSocietyId() {
        return societyId;
    }

    public void setSocietyId(int societyId) {
        this.societyId = societyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocietyAdmin that = (SocietyAdmin) o;

        if (personId != that.personId) return false;
        return societyId == that.societyId;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + societyId;
        return result;
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
