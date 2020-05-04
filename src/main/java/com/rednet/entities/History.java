package com.rednet.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class History {
    private Timestamp time;
    private Byte complitionStatus;
    private Byte historyType;
    private int personId;
    private Person personByPersonId;

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "complition_status", nullable = true)
    public Byte getComplitionStatus() {
        return complitionStatus;
    }

    public void setComplitionStatus(Byte complitionStatus) {
        this.complitionStatus = complitionStatus;
    }

    @Basic
    @Column(name = "history_type", nullable = true)
    public Byte getHistoryType() {
        return historyType;
    }

    public void setHistoryType(Byte historyType) {
        this.historyType = historyType;
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

        History history = (History) o;

        if (personId != history.personId) return false;
        if (!Objects.equals(time, history.time)) return false;
        if (!Objects.equals(complitionStatus, history.complitionStatus))
            return false;
        if (!Objects.equals(historyType, history.historyType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (complitionStatus != null ? complitionStatus.hashCode() : 0);
        result = 31 * result + (historyType != null ? historyType.hashCode() : 0);
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
