package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "conveyance_provider", schema = "rednet")
public class ConveyanceProvider {
    private Byte isMute;
    private int personId;
    private Person personByPersonId;

    @Basic
    @Column(name = "is_mute", nullable = true)
    public Byte getIsMute() {
        return isMute;
    }

    public void setIsMute(Byte isMute) {
        this.isMute = isMute;
    }

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConveyanceProvider that = (ConveyanceProvider) o;

        if (personId != that.personId) return false;
        return Objects.equals(isMute, that.isMute);
    }

    @Override
    public int hashCode() {
        int result = isMute != null ? isMute.hashCode() : 0;
        result = 31 * result + personId;
        return result;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
