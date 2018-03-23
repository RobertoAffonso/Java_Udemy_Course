package com.roberto.todolist.datamodel;


import java.time.LocalDate;

/**
 * @author Roberto Affonso, created on 19/03/18
 **/

public class TodoItem {
    private String description;
    private String details;
    private LocalDate deadline;

    public TodoItem(String description, String details, LocalDate deadline) {
        this.description = description;
        this.details = details;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
