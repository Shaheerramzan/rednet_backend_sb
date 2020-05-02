package com.rednet.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Society {
    private int id;
    private String name;
    private int headId;
    private Collection<Donor> donorsById;
    private Person personByHeadId;
    private Collection<SocietyAdmin> societyAdminsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        if (id != society.id) return false;
        return Objects.equals(name, society.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "head_id", nullable = false)
    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }

    @OneToMany(mappedBy = "societyBySocietyId")
    public Collection<Donor> getDonorsById() {
        return donorsById;
    }

    public void setDonorsById(Collection<Donor> donorsById) {
        this.donorsById = donorsById;
    }

    @ManyToOne
    @JoinColumn(name = "head_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByHeadId() {
        return personByHeadId;
    }

    public void setPersonByHeadId(Person personByHeadId) {
        this.personByHeadId = personByHeadId;
    }

    @OneToMany(mappedBy = "societyBySocietyId")
    public Collection<SocietyAdmin> getSocietyAdminsById() {
        return societyAdminsById;
    }

    public void setSocietyAdminsById(Collection<SocietyAdmin> societyAdminsById) {
        this.societyAdminsById = societyAdminsById;
    }
}
