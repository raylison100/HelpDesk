package br.com.helpdesk.api.security.entity;

import br.com.helpdesk.api.security.enums.PriorityEnun;
import br.com.helpdesk.api.security.enums.StatusEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Ticket {

    @Id
    private String id;

    @DBRef(lazy = true)
    private User user;

    private Date date;

    private String title;

    private Integer number;

    private StatusEnum status;

    private PriorityEnun priority;

    @DBRef(lazy = true)
    private User assignedUser;

    private String desciption;

    private String image;

    @Transient
    private List<ChangeStatus> changes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PriorityEnun getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnun priority) {
        this.priority = priority;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ChangeStatus> getChanges() {
        return changes;
    }

    public void setChanges(List<ChangeStatus> changes) {
        this.changes = changes;
    }
}
