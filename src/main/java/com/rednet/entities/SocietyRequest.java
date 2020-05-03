package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "society_request", schema = "rednet")
public class SocietyRequest {
    private int societyRequestId;
    private String name;
    private String description;
    private Person personByHeadId;

    @Id
    @Column(name = "society_request_id", nullable = false)
    public int getSocietyRequestId() {
        return societyRequestId;
    }

    public void setSocietyRequestId(int societyRequestId) {
        this.societyRequestId = societyRequestId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocietyRequest that = (SocietyRequest) o;
        return societyRequestId == that.societyRequestId &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(societyRequestId, name, description);
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
}
