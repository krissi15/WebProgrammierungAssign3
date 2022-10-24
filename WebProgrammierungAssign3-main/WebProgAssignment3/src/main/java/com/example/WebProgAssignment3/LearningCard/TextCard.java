package com.example.WebProgAssignment3.LearningCard;

import java.time.LocalDateTime;

public class TextCard extends LearningCard{
    private String answer;

    public TextCard(Integer id, String question, String answer, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean checkUserAnswer(String answer) {
        if(answer.equals(this.answer)) {    //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                 //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
