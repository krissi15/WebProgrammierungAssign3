package com.example.WebProgAssignment3.LearningCard;

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

    public Boolean checkUserAnswer(String answer) {
        if(answer.equals(this.answer)) {
            return true;
        }
        return false;
    }
}
