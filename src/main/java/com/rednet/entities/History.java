package com.rednet.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class History {
    private int id;
    private Timestamp time;
    private Byte complitionStatus;
    private Byte historyType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        History history = (History) o;

        if (id != history.id) return false;
        if (time != null ? !time.equals(history.time) : history.time != null) return false;
        if (complitionStatus != null ? !complitionStatus.equals(history.complitionStatus) : history.complitionStatus != null)
            return false;
        if (historyType != null ? !historyType.equals(history.historyType) : history.historyType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (complitionStatus != null ? complitionStatus.hashCode() : 0);
        result = 31 * result + (historyType != null ? historyType.hashCode() : 0);
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
