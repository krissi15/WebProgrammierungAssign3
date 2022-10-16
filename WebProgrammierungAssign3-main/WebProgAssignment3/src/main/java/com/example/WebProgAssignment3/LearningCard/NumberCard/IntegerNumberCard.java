package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class IntegerNumberCard extends NumberCard{
    private Integer answer;

    public IntegerNumberCard(Integer id, String question, Integer answer) {
        super(id, question);
        this.answer = answer;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public void checkUserAnswer(Integer userAnswer) {

    }
}
