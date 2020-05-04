package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Complain {
    private int complainId;
    private String message;
    private Byte isResolved;
    private String reply;
    private Person personByComplainant;
    private Person personBySuspect;

    @Id
    @Column(name = "complain_id", nullable = false)
    public int getComplainId() {
        return complainId;
    }

    public void setComplainId(int complainId) {
        this.complainId = complainId;
    }

    @Basic
    @Column(name = "message", nullable = true, length = 1000)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "is_resolved", nullable = true)
    public Byte getIsResolved() {
        return isResolved;
    }

    public void setIsResolved(Byte isResolved) {
        this.isResolved = isResolved;
    }

    @Basic
    @Column(name = "reply", nullable = true, length = 1000)
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complain complain = (Complain) o;
        return complainId == complain.complainId &&
                Objects.equals(message, complain.message) &&
                Objects.equals(isResolved, complain.isResolved) &&
                Objects.equals(reply, complain.reply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(complainId, message, isResolved, reply);
    }

    @ManyToOne
    @JoinColumn(name = "complainant", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonByComplainant() {
        return personByComplainant;
    }

    public void setPersonByComplainant(Person personByComplainant) {
        this.personByComplainant = personByComplainant;
    }

    @ManyToOne
    @JoinColumn(name = "complanie", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonByComplanie() {
        return personByComplanie;
    }

    public void setPersonBySuspect(Person personBySuspect) {
        this.personBySuspect = personBySuspect;
    }
}
