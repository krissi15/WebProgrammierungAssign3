package com.example.WebProgAssignment3.LearningCard;

import com.example.WebProgAssignment3.RecurringClassification.RecurringClassification;

import java.util.Date;

public class TextCard extends LearningCard{
    private String answer;

    public TextCard(String question, String answer) {
        super(question);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void checkUserAnswer(String userAnswer) {

    }
}
