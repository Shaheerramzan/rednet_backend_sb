package com.rednet.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class History {
    private int id;
    private Timestamp time;
    private Byte complitionStatus;
    private Byte historyType;
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
        if (!Objects.equals(time, history.time)) return false;
        if (!Objects.equals(complitionStatus, history.complitionStatus))
            return false;
        return Objects.equals(historyType, history.historyType);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (complitionStatus != null ? complitionStatus.hashCode() : 0);
        result = 31 * result + (historyType != null ? historyType.hashCode() : 0);
        return result;
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
