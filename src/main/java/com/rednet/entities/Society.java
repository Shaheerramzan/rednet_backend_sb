package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Society {
    private String name;
    private int headId;
    private Person personByHeadId;

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "head_id", nullable = false)
    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Society society = (Society) o;

        if (headId != society.headId) return false;
        return Objects.equals(name, society.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + headId;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "head_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByHeadId() {
        return personByHeadId;
    }

    public void setPersonByHeadId(Person personByHeadId) {
        this.personByHeadId = personByHeadId;
    }
}
