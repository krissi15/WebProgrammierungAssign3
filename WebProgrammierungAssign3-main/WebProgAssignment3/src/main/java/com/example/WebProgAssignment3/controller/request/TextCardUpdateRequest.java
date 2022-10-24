package com.example.WebProgAssignment3.controller.request;

import java.util.List;

public class TextCardUpdateRequest {
    private Integer id;
    private String answer;
    private String question;
    private Integer rightAnswer;
    private List<String> answers;
    private List<Integer> rightAnswers;
    private Integer learningZyklus;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public List<Integer> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(List<Integer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Integer getLearningZyklus() {
        return learningZyklus;
    }

    public void setLearningZyklus(Integer learningZyklus) {
        this.learningZyklus = learningZyklus;
    }

}
