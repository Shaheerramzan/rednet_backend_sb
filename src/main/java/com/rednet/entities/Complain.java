package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Complain {
    private int complainant;
    private String message;
    private Byte isResolved;
    private String reply;
    private Person personByComplainant;
    private Person personBySuspect;

    @Id
    @Column(name = "complainant", nullable = false)
    public int getComplainant() {
        return complainant;
    }

    public void setComplainant(int complainant) {
        this.complainant = complainant;
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

        if (complainant != complain.complainant) return false;
        if (!Objects.equals(message, complain.message)) return false;
        if (!Objects.equals(isResolved, complain.isResolved)) return false;
        return Objects.equals(reply, complain.reply);
    }

    @Override
    public int hashCode() {
        int result = complainant;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (isResolved != null ? isResolved.hashCode() : 0);
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "complainant", referencedColumnName = "id", nullable = false)
    public Person getPersonByComplainant() {
        return personByComplainant;
    }

    public void setPersonByComplainant(Person personByComplainant) {
        this.personByComplainant = personByComplainant;
    }

    @ManyToOne
    @JoinColumn(name = "suspect", referencedColumnName = "id", nullable = false)
    public Person getPersonBySuspect() {
        return personBySuspect;
    }

    public void setPersonBySuspect(Person personBySuspect) {
        this.personBySuspect = personBySuspect;
    }
}
