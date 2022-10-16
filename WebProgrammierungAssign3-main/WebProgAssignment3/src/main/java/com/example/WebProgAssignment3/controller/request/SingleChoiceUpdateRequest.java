package com.example.WebProgAssignment3.controller.request;

import java.util.List;

public class SingleChoiceUpdateRequest {
    private Integer id;
    private String question;
    private List<String> answers;
    private Integer rightAnswer;
    private Integer userAnswer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Integer getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(Integer userAnswer) {
        this.userAnswer = userAnswer;
    }
}
