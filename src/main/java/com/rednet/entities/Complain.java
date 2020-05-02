package com.rednet.entities;

import javax.persistence.*;

@Entity
public class Complain {
    private int id;
    private String message;
    private Byte isResolved;
    private String reply;
    private int complainant;
    private int complanie;
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
        if (message != null ? !message.equals(complain.message) : complain.message != null) return false;
        if (isResolved != null ? !isResolved.equals(complain.isResolved) : complain.isResolved != null) return false;
        if (reply != null ? !reply.equals(complain.reply) : complain.reply != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (isResolved != null ? isResolved.hashCode() : 0);
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "complainant", nullable = false)
    public int getComplainant() {
        return complainant;
    }

    public void setComplainant(int complainant) {
        this.complainant = complainant;
    }

    @Basic
    @Column(name = "complanie", nullable = false)
    public int getComplanie() {
        return complanie;
    }

    public void setComplanie(int complanie) {
        this.complanie = complanie;
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
