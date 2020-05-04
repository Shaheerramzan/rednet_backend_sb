package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Chat {
    private String message;
    private int sender;
    private Person personBySender;
    private Person personByReceiver;

    @Basic
    @Column(name = "message", nullable = true, length = 500)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Id
    @Column(name = "sender", nullable = false)
    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (sender != chat.sender) return false;
        return Objects.equals(message, chat.message);
    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + sender;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "sender", referencedColumnName = "id", nullable = false)
    public Person getPersonBySender() {
        return personBySender;
    }

    public void setPersonBySender(Person personBySender) {
        this.personBySender = personBySender;
    }

    @ManyToOne
    @JoinColumn(name = "receiver", referencedColumnName = "id", nullable = false)
    public Person getPersonByReceiver() {
        return personByReceiver;
    }

    public void setPersonByReceiver(Person personByReceiver) {
        this.personByReceiver = personByReceiver;
    }
}
