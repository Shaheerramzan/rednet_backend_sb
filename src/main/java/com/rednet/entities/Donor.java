package com.rednet.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Donor {
    private int id;
    private Date lastDonatedDate;
    private Byte isBusy;
    private Byte systemMute;
    private Society societyBySocietyId;
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

        if (id != donor.id) return false;
        if (!Objects.equals(lastDonatedDate, donor.lastDonatedDate))
            return false;
        if (!Objects.equals(isBusy, donor.isBusy)) return false;
        return Objects.equals(systemMute, donor.systemMute);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastDonatedDate != null ? lastDonatedDate.hashCode() : 0);
        result = 31 * result + (isBusy != null ? isBusy.hashCode() : 0);
        result = 31 * result + (systemMute != null ? systemMute.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "society_id", referencedColumnName = "id", nullable = false)
    public Society getSocietyBySocietyId() {
        return societyBySocietyId;
    }

    public void setSocietyBySocietyId(Society societyBySocietyId) {
        this.societyBySocietyId = societyBySocietyId;
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
