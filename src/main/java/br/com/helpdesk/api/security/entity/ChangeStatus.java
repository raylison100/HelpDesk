package br.com.helpdesk.api.security.entity;


import br.com.helpdesk.api.security.enums.StatusEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class ChangeStatus {

    @Id
    private String id;

    @DBRef
    private Ticket ticket;

    @DBRef
    private User userChanger;

    private Date dateChangerStatus;

    private StatusEnum status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public User getUserChanger() {
        return userChanger;
    }

    public void setUserChanger(User userChanger) {
        this.userChanger = userChanger;
    }

    public Date getDateChangerStatus() {
        return dateChangerStatus;
    }

    public void setDateChangerStatus(Date dateChangerStatus) {
        this.dateChangerStatus = dateChangerStatus;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
