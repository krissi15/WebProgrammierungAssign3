package com.example.WebProgAssignment3.LearningCard;

import java.util.ArrayList;

public class MultipleChoiceCard extends LearningCard{
    private ArrayList<String> answers = new ArrayList<String>();
    private ArrayList<Boolean> answerCorrect = new ArrayList<Boolean>();

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<Boolean> getAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(ArrayList<Boolean> answerCorrect) {
        this.answerCorrect = answerCorrect;
    }

    public void checkUserAnswer(Integer userChooseAnswerNumber) {

    }
}
