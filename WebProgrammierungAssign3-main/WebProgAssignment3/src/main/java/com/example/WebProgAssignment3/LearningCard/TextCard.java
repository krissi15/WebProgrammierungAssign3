package com.example.WebProgAssignment3.LearningCard;

import com.example.WebProgAssignment3.RecurringClassification.RecurringClassification;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextCard extends LearningCard{
    private String answer;

    public TextCard(Integer id, String question, String answer) {
        super(id, question);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
