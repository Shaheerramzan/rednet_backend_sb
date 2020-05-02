package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Complain {
    private int id;
    private String message;
    private Byte isResolved;
    private String reply;
    private Person personByComplainant;
    private Person personByComplanie;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        if (id != complain.id) return false;
        if (!Objects.equals(message, complain.message)) return false;
        if (!Objects.equals(isResolved, complain.isResolved)) return false;
        return Objects.equals(reply, complain.reply);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (isResolved != null ? isResolved.hashCode() : 0);
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "complainant", referencedColumnName = "id", nullable = false)
    public Person getPersonByComplainant() {
        return personByComplainant;
    }

    public void setPersonByComplainant(Person personByComplainant) {
        this.personByComplainant = personByComplainant;
    }

    @ManyToOne
    @JoinColumn(name = "complanie", referencedColumnName = "id", nullable = false)
    public Person getPersonByComplanie() {
        return personByComplanie;
    }

    public void setPersonByComplanie(Person personByComplanie) {
        this.personByComplanie = personByComplanie;
    }
}
