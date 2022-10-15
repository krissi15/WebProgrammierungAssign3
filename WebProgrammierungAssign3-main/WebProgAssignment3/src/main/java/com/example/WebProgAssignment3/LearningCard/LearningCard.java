package com.example.WebProgAssignment3.LearningCard;

import com.example.WebProgAssignment3.RecurringClassification.RecurringClassification;


import java.util.Date;

public class LearningCard {
    private Integer id;
    private RecurringClassification recurringClassification;
    private Integer succesCount;
    private Date creationDate;
    private Date nextDueDate;
    private Boolean isDraft;
    private String question;

    public LearningCard(Integer id, String question) {
        this.question = question;
        this.id = id;
    }

    public LearningCard(String question) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RecurringClassification getRecurringClassification() {
        return recurringClassification;
    }

    public void setRecurringClassification(RecurringClassification recurringClassification) {
        this.recurringClassification = recurringClassification;
    }

    public Integer getSuccesCount() {
        return succesCount;
    }

    public void setSuccesCount(Integer succesCount) {
        this.succesCount = succesCount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(Date nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public Boolean isDraft() {
        return isDraft;
    }

    public void setDraft(Boolean draft) {
        isDraft = draft;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
