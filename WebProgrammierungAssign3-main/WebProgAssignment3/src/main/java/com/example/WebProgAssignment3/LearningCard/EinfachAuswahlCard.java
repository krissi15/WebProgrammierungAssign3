package com.example.WebProgAssignment3.LearningCard;

import java.util.ArrayList;
import java.util.List;

public class EinfachAuswahlCard extends LearningCard{

    private List<String> anwser;
    private Integer rightAnswer;

    public EinfachAuswahlCard(Integer id, String question, List<String> anwser, Integer rightAnswer) {
        super(id, question);
        this.anwser = anwser;
        this.rightAnswer = rightAnswer;
    }

    public List<String> getAnwser() {
        return anwser;
    }

    public void setAnwser(List<String> anwser) {
        this.anwser = anwser;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
