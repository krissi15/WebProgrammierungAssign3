package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class DoubleNumberCard extends NumberCard{
    private Double answer;

    public DoubleNumberCard(Integer id, String question, Double answer) {
        super(id, question);
        this.answer= answer;
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public void checkUserAnswer(Double userAnswer) {

    }
}
