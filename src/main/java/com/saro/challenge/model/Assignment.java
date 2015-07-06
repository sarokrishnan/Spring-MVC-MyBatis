package com.saro.challenge.model;

/**
 * Created by sbalakrishnan on 7/6/15.
 */
import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Assignment implements Serializable{

    private static final long serialVersionUID = 1L;

    int assigneeId;
    String assigneeName;
    String assignmentName;
    java.sql.Date creationDate ;
    java.sql.Date dueDate ;

    public int getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(int assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public java.sql.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.sql.Date creationDate) {
        this.creationDate = creationDate;
    }

    public java.sql.Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(java.sql.Date dueDate) {
        this.dueDate = dueDate;
    }
}