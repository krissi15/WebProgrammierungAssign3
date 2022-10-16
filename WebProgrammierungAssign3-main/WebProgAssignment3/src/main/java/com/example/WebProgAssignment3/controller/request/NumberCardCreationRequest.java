package com.example.WebProgAssignment3.controller.request;

public class NumberCardCreationRequest {
    private Integer intAnswer;
    private Double doubleAnswer;
    private Long longAnswer;
    private String question;

    public Integer getIntAnswer() {
        return intAnswer;
    }

    public void setIntAnswer(Integer intAnswer) {
        this.intAnswer = intAnswer;
    }

    public Double getDoubleAnswer() {
        return doubleAnswer;
    }

    public void setDoubleAnswer(Double douAnswer) {
        this.doubleAnswer = douAnswer;
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
}
