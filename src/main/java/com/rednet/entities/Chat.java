package com.rednet.entities;

import javax.persistence.*;

@Entity
public class Chat {
    private int id;
    private String message;
    private int sender;
    private int receiver;
    private Person personBySender;
    private Person personByReceiver;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message", nullable = true, length = 500)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (id != chat.id) return false;
        if (message != null ? !message.equals(chat.message) : chat.message != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "sender", nullable = false)
    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    @Basic
    @Column(name = "receiver", nullable = false)
    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    @ManyToOne
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
