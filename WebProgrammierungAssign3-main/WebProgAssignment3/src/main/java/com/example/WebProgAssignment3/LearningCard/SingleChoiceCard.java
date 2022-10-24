package com.example.WebProgAssignment3.LearningCard;

import java.util.List;

public class SingleChoiceCard extends LearningCard{
    private List<String> answers;
    private Integer rightAnswer;

    public SingleChoiceCard(Integer id, String question, List<String> answers, Integer rightAnswer, Integer learningZyklus) {
        super(id, question, learningZyklus);
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Integer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Integer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Boolean checkUserAnswer(Integer rightAnswer) {
        if(rightAnswer.equals(this.rightAnswer)) {      //Abfrage, ob die eingegebene Antwort die richtige ist
            super.solved();                             //Hilfsfunktion für die Aktualisierung der Wiederholung
            return true;
        }
        return false;
    }
}
