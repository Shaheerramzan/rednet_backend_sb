package com.rednet.entities;

import javax.persistence.*;

@Entity
@Table(name = "conveyance_provider", schema = "rednet", catalog = "")
public class ConveyanceProvider {
    private int id;
    private Byte isMute;
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

    @Basic
    @Column(name = "is_mute", nullable = true)
    public Byte getIsMute() {
        return isMute;
    }

    public void setIsMute(Byte isMute) {
        this.isMute = isMute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConveyanceProvider that = (ConveyanceProvider) o;

        if (id != that.id) return false;
        if (isMute != null ? !isMute.equals(that.isMute) : that.isMute != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (isMute != null ? isMute.hashCode() : 0);
        return result;
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
