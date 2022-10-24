package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class DoubleNumberCard extends NumberCard{
    private Double answer;

    public DoubleNumberCard(Integer id, String question, Double answer, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answer= answer;
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public Boolean checkUserAnswer(Double rightAnswer) {
        if(rightAnswer.equals(this.answer)) {       //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                         //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
