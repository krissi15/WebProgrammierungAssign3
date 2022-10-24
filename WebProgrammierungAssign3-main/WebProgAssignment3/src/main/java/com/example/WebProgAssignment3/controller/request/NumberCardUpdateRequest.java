package com.example.WebProgAssignment3.controller.request;

public class NumberCardUpdateRequest {
    private Integer id;
    private Integer intAnswer;
    private Double doubleAnswer;
    private Long longAnswer;
    private String question;
    private Integer learningZyklus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIntAnswer() {
        return intAnswer;
    }

    public void setIntAnswer(Integer intAnswer) {
        this.intAnswer = intAnswer;
    }

    public Double getDoubleAnswer() {
        return doubleAnswer;
    }

    public void setDoubleAnswer(Double doubleAnswer) {
        this.doubleAnswer = doubleAnswer;
    }

    public Long getLongAnswer() {
        return longAnswer;
    }

    public void setLongAnswer(Long longAnswer) {
        this.longAnswer = longAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getLearningZyklus() {
        return learningZyklus;
    }

    public void setLearningZyklus(Integer learningZyklus) {
        this.learningZyklus = learningZyklus;
    }
}
