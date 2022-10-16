package com.example.WebProgAssignment3.service;

import com.example.WebProgAssignment3.LearningCard.SingleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextCardService {

    private Integer TextCardAnzahl;
    private Integer TextCardSingleChoiceAnzahl;
    private List<TextCard> alleTextCards;
    private List<SingleChoiceCard> alleSingleChoiceCards;

    public TextCardService() {
        this.TextCardAnzahl = 0;
        this.TextCardSingleChoiceAnzahl = 0;
        this.alleTextCards = new ArrayList<TextCard>();
        this.alleSingleChoiceCards = new ArrayList<SingleChoiceCard>();
    }

    public TextCard createTextCard(String question, String answer) {
        TextCard textCard = new TextCard(TextCardAnzahl++, question, answer);
        alleTextCards.add(textCard);
        return textCard;
    }

    public List<TextCard> gebeAlleTextCards() {
        return alleTextCards;
    }

    public TextCard updateTextCard(Integer id, String question, String answer) {

        for (int i = 0; i<alleTextCards.size(); i++) {
            TextCard textCard = alleTextCards.get(i);

            if (id.equals(textCard.getId())) {
                textCard.setQuestion(question);
                textCard.setAnswer(answer);
                return textCard;
            }
        }
        return null;
    }

    public Boolean deleteTextCard(Integer id) { //Kann auch bei Learningcard angewendet werden-> also nur eine Methode
        for (int i = 0; i < alleTextCards.size(); i++) {
            TextCard textCard = alleTextCards.get(i);

            if (id.equals(textCard.getId())) {
                alleTextCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    public void checkTextCardAnswer(String answer) {
        for (int i = 0; i < alleTextCards.size(); i++) {
            TextCard textCard = alleTextCards.get(i);

        }
    }

    //_____________________SingleChoiceTextCard_______//

    public SingleChoiceCard createSingleChoiceTextCard(String question, List<String> answers, Integer userAnswer, Integer rightAnswer) {
        SingleChoiceCard singleChoiceCard = new SingleChoiceCard(TextCardSingleChoiceAnzahl++, question, answers, rightAnswer, userAnswer);
        if (rightAnswer==userAnswer) {
            alleSingleChoiceCards.add(singleChoiceCard);
            return singleChoiceCard;
        }
         return null;
    }

    public List<SingleChoiceCard> gebealleSingleChoiceTextCards() {
        return alleSingleChoiceCards;
    }

    public SingleChoiceCard updateSingleChoice(Integer id, String question, List<String> answers, Integer rightanswer, Integer rightAnswerIndex) {

        for (int i = 0; i<alleSingleChoiceCards.size(); i++) {
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);

            if (id.equals(singleChoiceCard.getId())) {
                singleChoiceCard.setQuestion(question);
                singleChoiceCard.setAnswers(answers);
                singleChoiceCard.setRightAnswer(rightanswer);
                return singleChoiceCard;
            }
        }
        return null;
    }

    public Boolean deleteSingleChoice(Integer id) { //Kann auch bei Learningcard angewendet werden-> also nur eine Methode
        for (int i = 0; i < alleSingleChoiceCards.size(); i++) {
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);

            if (id.equals(singleChoiceCard.getId())) {
                alleSingleChoiceCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }
}
