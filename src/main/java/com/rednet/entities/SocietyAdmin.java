package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "society_admin", schema = "rednet")
public class SocietyAdmin {
    private int societyAdminId;
    private Person personByPersonId;
    private Society societyBySocietyId;

    @Id
    @Column(name = "society_admin_id", nullable = false)
    public int getSocietyAdminId() {
        return societyAdminId;
    }

    public void setSocietyAdminId(int societyAdminId) {
        this.societyAdminId = societyAdminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocietyAdmin that = (SocietyAdmin) o;
        return societyAdminId == that.societyAdminId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(societyAdminId);
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }

    @ManyToOne
    @JoinColumn(name = "society_id", referencedColumnName = "society_id", nullable = false)
    @JsonIgnore
    public Society getSocietyBySocietyId() {
        return societyBySocietyId;
    }

    public void setSocietyBySocietyId(Society societyBySocietyId) {
        this.societyBySocietyId = societyBySocietyId;
    }
}
