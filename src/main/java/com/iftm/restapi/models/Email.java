package com.iftm.restapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String from;

    @Column(length = 100)
    private String to;

    @Column(length = 100)
    private String subject;

    @Column(length = 100)
    private String bory;

    @Column(length = 100)
    private String attachment;

    public Email() {}

    @Override
    public String toString() {
        return "Email [id=" + id + ", from=" + from + ", to=" + to + ", subject=" + subject + ", bory=" + bory
                + ", attachment=" + attachment + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + ((bory == null) ? 0 : bory.hashCode());
        result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Email other = (Email) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        if (bory == null) {
            if (other.bory != null)
                return false;
        } else if (!bory.equals(other.bory))
            return false;
        if (attachment == null) {
            if (other.attachment != null)
                return false;
        } else if (!attachment.equals(other.attachment))
            return false;
        return true;
    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFrom() {
        return from;
    }


    public void setFrom(String from) {
        this.from = from;
    }


    public String getTo() {
        return to;
    }


    public void setTo(String to) {
        this.to = to;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getBory() {
        return bory;
    }


    public void setBory(String bory) {
        this.bory = bory;
    }


    public String getAttachment() {
        return attachment;
    }


    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    

    
}
