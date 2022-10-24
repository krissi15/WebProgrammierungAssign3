package com.example.WebProgAssignment3.LearningCard;

import java.time.LocalDateTime;

public class LearningCard {
    private Integer id;
    private LocalDateTime solveDate;
    private Integer learningZyklus;
    private String question;

    public LearningCard(Integer id, String question, Integer learningZyklus) {
        this.question = question;
        this.id = id;
        this.solveDate = LocalDateTime.MIN;
        this.learningZyklus = learningZyklus;
    }

    public LearningCard(String question) {
    }

    public LearningCard(Integer id, String question) {
        this.question = question;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getSolveDate() {
        return solveDate;
    }

    public void setSolveDate(LocalDateTime solveDate) {
        this.solveDate = solveDate;
    }

    public Integer getLearningZyklus() {
        return learningZyklus;
    }

    public void setLearningZyklus(Integer learningZyklus) {
        this.learningZyklus = learningZyklus;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void solved() {
        solveDate = LocalDateTime.now().plusHours(learningZyklus);
    }
}
