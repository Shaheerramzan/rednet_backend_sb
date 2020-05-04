package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class History {
    private int historyId;
    private Timestamp time;
    private Byte completionStatus;
    private Byte historyType;
    private int personId;
    private Person personByPersonId;

    @Id
    @Column(name = "history_id", nullable = false)
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
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
    @Column(name = "completion_status", nullable = true)
    public Byte getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(Byte completionStatus) {
        this.completionStatus = completionStatus;
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
        return historyId == history.historyId &&
                Objects.equals(time, history.time) &&
                Objects.equals(completionStatus, history.completionStatus) &&
                Objects.equals(historyType, history.historyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyId, time, completionStatus, historyType);
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
