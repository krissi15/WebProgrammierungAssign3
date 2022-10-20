package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class LongNumberCard extends NumberCard{
    private Long answer;

    public LongNumberCard(Integer id, String question, Long answer) {
        super(id, question);
        this.answer = answer;
    }

    public Long getAnswer() {
        return answer;
    }

    public void setAnswer(Long answer) {
        this.answer = answer;
    }

    public void checkUserAnswer(Long userAnswer) {

    }
}
