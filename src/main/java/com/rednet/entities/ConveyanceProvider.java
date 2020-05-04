package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "conveyance_provider", schema = "rednet")
public class ConveyanceProvider {
    private int conveyanceProviderId;
    private Byte isMute;
    private int personId;
    private Person personByPersonId;

    @Id
    @Column(name = "conveyance_provider_id", nullable = false)
    public int getConveyanceProviderId() {
        return conveyanceProviderId;
    }

    public void setConveyanceProviderId(int conveyanceProviderId) {
        this.conveyanceProviderId = conveyanceProviderId;
    }

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
        return conveyanceProviderId == that.conveyanceProviderId &&
                Objects.equals(isMute, that.isMute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conveyanceProviderId, isMute);
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
}
