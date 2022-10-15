package com.example.WebProgAssignment3.controller.request;

import java.util.List;

public class EinfachAuswahlCardCreationRequest {
    private List<String> answer;
    private String question;
    private Integer rightAnswer;

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
