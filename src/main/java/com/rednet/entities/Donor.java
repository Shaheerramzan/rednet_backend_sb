package com.rednet.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Donor {
    private int donorId;
    private Date lastDonatedDate;
    private Byte isBusy;
    private Byte systemMute;
    private Society societyBySocietyId;
    private Person personByPersonId;

    @Id
    @Column(name = "donor_id", nullable = false)
    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    @Basic
    @Column(name = "last_donated_date", nullable = true)
    public Date getLastDonatedDate() {
        return lastDonatedDate;
    }

    public void setLastDonatedDate(Date lastDonatedDate) {
        this.lastDonatedDate = lastDonatedDate;
    }

    @Basic
    @Column(name = "is_busy", nullable = true)
    public Byte getIsBusy() {
        return isBusy;
    }

    public void setIsBusy(Byte isBusy) {
        this.isBusy = isBusy;
    }

    @Basic
    @Column(name = "system_mute", nullable = true)
    public Byte getSystemMute() {
        return systemMute;
    }

    public void setSystemMute(Byte systemMute) {
        this.systemMute = systemMute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donor donor = (Donor) o;
        return donorId == donor.donorId &&
                Objects.equals(lastDonatedDate, donor.lastDonatedDate) &&
                Objects.equals(isBusy, donor.isBusy) &&
                Objects.equals(systemMute, donor.systemMute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(donorId, lastDonatedDate, isBusy, systemMute);
    }

    @ManyToOne
    @JoinColumn(name = "society_id", referencedColumnName = "society_id", nullable = false)
    public Society getSocietyBySocietyId() {
        return societyBySocietyId;
    }

    public void setSocietyBySocietyId(Society societyBySocietyId) {
        this.societyBySocietyId = societyBySocietyId;
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
