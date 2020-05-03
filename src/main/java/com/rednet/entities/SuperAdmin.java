package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "super_admin", schema = "rednet")
public class SuperAdmin {
    private int superAdminId;
    private Person personByPersonId;

    @Id
    @Column(name = "super_admin_id", nullable = false)
    public int getSuperAdminId() {
        return superAdminId;
    }

    public void setSuperAdminId(int superAdminId) {
        this.superAdminId = superAdminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperAdmin that = (SuperAdmin) o;
        return superAdminId == that.superAdminId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(superAdminId);
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
