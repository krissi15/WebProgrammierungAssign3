package com.example.WebProgAssignment3.service;

import com.example.WebProgAssignment3.LearningCard.EinfachAuswahlCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextCardService {

    private Integer TextCardAnzahl;
    private Integer TextCardEinfachAuswahlAnzahl;
    private List<TextCard> alleTextCards;

    public TextCardService() {
        this.TextCardAnzahl = 0;
        this.TextCardEinfachAuswahlAnzahl = 0;
        this.alleTextCards = new ArrayList<TextCard>();
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

    public EinfachAuswahlCard createeinfachAuswahlTextCard(String question, List<String> answer, Integer rightanswer) {
        EinfachAuswahlCard einfachAuswahlCard = new EinfachAuswahlCard(TextCardEinfachAuswahlAnzahl++, question, answer,rightanswer);
        return einfachAuswahlCard;
    }
}
