package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Society {
    private int societyId;
    private String name;
    private Collection<Donor> donorsBySocietyId;
    private Person personByHeadId;
    private Collection<SocietyAdmin> societyAdminsBySocietyId;

    @Id
    @Column(name = "society_id", nullable = false)
    public int getSocietyId() {
        return societyId;
    }

    public void setSocietyId(int societyId) {
        this.societyId = societyId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Society society = (Society) o;
        return societyId == society.societyId &&
                Objects.equals(name, society.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(societyId, name);
    }

    @OneToMany(mappedBy = "societyBySocietyId")
    public Collection<Donor> getDonorsBySocietyId() {
        return donorsBySocietyId;
    }

    public void setDonorsBySocietyId(Collection<Donor> donorsBySocietyId) {
        this.donorsBySocietyId = donorsBySocietyId;
    }

    @ManyToOne
    @JoinColumn(name = "head_id", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonByHeadId() {
        return personByHeadId;
    }

    public void setPersonByHeadId(Person personByHeadId) {
        this.personByHeadId = personByHeadId;
    }

    @OneToMany(mappedBy = "societyBySocietyId")
    @JsonIgnore
    public Collection<SocietyAdmin> getSocietyAdminsBySocietyId() {
        return societyAdminsBySocietyId;
    }

    public void setSocietyAdminsBySocietyId(Collection<SocietyAdmin> societyAdminsBySocietyId) {
        this.societyAdminsBySocietyId = societyAdminsBySocietyId;
    }
}
