package com.example.WebProgAssignment3.LearningCard;

import java.util.ArrayList;
import java.util.List;

public class SingleChoiceCard extends LearningCard{
    private List<String> answers;
    private Integer rightAnswer;
    private Integer userAnswer;

    public SingleChoiceCard(Integer id, String question, List<String> anwsers, Integer userAnser, Integer rightAnswer) {
        super(id, question);
        this.answers = anwsers;
        this.userAnswer = userAnswer;
        this.rightAnswer = rightAnswer;
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

    public void checksUserAnswer() {

    }
}
