package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class IntegerNumberCard extends NumberCard{
    private Integer answer;

    public IntegerNumberCard(Integer id, String question, Integer answer, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answer = answer;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public Boolean checkUserAnswer(Integer rightAnswer) {
        if(rightAnswer.equals(this.answer)) {       //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                         //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
