package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "society_request", schema = "rednet", catalog = "")
public class SocietyRequest {
    private int id;
    private String name;
    private String description;
    private int headId;
    private Person personByHeadId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
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

    @ManyToOne
    @JoinColumn(name = "head_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByHeadId() {
        return personByHeadId;
    }

    public void setPersonByHeadId(Person personByHeadId) {
        this.personByHeadId = personByHeadId;
    }
}
