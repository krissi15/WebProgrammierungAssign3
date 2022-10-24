package com.example.WebProgAssignment3.LearningCard.NumberCard;

public class LongNumberCard extends NumberCard{
    private Long answer;

    public LongNumberCard(Integer id, String question, Long answer, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answer = answer;
    }

    public Long getAnswer() {
        return answer;
    }

    public void setAnswer(Long answer) {
        this.answer = answer;
    }

    public Boolean checkUserAnswer(Long rightAnswer) {
        if(rightAnswer.equals(this.answer)) {       //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                         //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
