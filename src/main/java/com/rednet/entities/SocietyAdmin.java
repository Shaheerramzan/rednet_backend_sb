package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "society_admin", schema = "rednet")
public class SocietyAdmin {
    private int id;
    private Society societyBySocietyId;
    private int personId;
    private int societyId;
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

        SocietyAdmin that = (SocietyAdmin) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "society_id", referencedColumnName = "id", nullable = false)
    public Society getSocietyBySocietyId() {
        return societyBySocietyId;
    }

    public void setSocietyBySocietyId(Society societyBySocietyId) {
        this.societyBySocietyId = societyBySocietyId;
    }

    @Basic
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

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
