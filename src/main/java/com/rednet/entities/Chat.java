package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Chat {
    private int chatId;
    private String message;
    private int sender;
    private Person personBySender;
    private Person personByReceiver;

    @Id
    @Column(name = "chat_id", nullable = false)
    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

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
        return chatId == chat.chatId &&
                Objects.equals(message, chat.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, message);
    }

    @ManyToOne
    @JoinColumn(name = "sender", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonBySender() {
        return personBySender;
    }

    public void setPersonBySender(Person personBySender) {
        this.personBySender = personBySender;
    }

    @ManyToOne
    @JoinColumn(name = "receiver", referencedColumnName = "person_id", nullable = false)
    @JsonIgnore
    public Person getPersonByReceiver() {
        return personByReceiver;
    }

    public void setPersonByReceiver(Person personByReceiver) {
        this.personByReceiver = personByReceiver;
    }
}
