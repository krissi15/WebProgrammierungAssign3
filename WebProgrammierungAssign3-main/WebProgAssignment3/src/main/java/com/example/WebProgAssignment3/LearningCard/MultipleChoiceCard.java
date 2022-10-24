package com.example.WebProgAssignment3.LearningCard;

import java.util.List;

public class MultipleChoiceCard extends LearningCard{
    private List<String> answers;
    private List<Integer> rightAnswers;


    public MultipleChoiceCard(Integer id, String question, List<String> answers, List<Integer> rightAnswers, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answers = answers;
        this.rightAnswers = rightAnswers;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public List<Integer> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(List<Integer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Boolean checkUserAnswer(List<Integer> rightAnswers) {
        if(rightAnswers.equals(this.rightAnswers)) {        //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                                 //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
