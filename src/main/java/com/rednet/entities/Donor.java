package com.rednet.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Donor {
    private Date lastDonatedDate;
    private Byte isBusy;
    private Byte systemMute;
    private int societyId;
    private int personId;
    private Person personByPersonId;

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

    @Basic
    @Column(name = "society_id", nullable = false)
    public int getSocietyId() {
        return societyId;
    }

    public void setSocietyId(int societyId) {
        this.societyId = societyId;
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

        Donor donor = (Donor) o;

        if (societyId != donor.societyId) return false;
        if (personId != donor.personId) return false;
        if (!Objects.equals(lastDonatedDate, donor.lastDonatedDate))
            return false;
        if (!Objects.equals(isBusy, donor.isBusy)) return false;
        return Objects.equals(systemMute, donor.systemMute);
    }

    @Override
    public int hashCode() {
        int result = lastDonatedDate != null ? lastDonatedDate.hashCode() : 0;
        result = 31 * result + (isBusy != null ? isBusy.hashCode() : 0);
        result = 31 * result + (systemMute != null ? systemMute.hashCode() : 0);
        result = 31 * result + societyId;
        result = 31 * result + personId;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
