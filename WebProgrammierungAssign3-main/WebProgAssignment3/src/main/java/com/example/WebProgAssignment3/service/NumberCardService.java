package com.example.WebProgAssignment3.service;


import com.example.WebProgAssignment3.LearningCard.NumberCard.DoubleNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.IntegerNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.LongNumberCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberCardService {

    private Integer IntegerNumberCardAnzahl;

    private Integer DoubleNumberCardAnzahl;

    private Integer LongNumberCardAnzahl;

    private List<IntegerNumberCard> alleIntegerNumberCards;

    private List<DoubleNumberCard> alleDoubleNumberCards;

    private List<LongNumberCard> alleLongNumberCards;

    public NumberCardService() {
        this.IntegerNumberCardAnzahl = 0;
        this.alleIntegerNumberCards = new ArrayList<IntegerNumberCard>();
        this.DoubleNumberCardAnzahl = 0;
        this.alleDoubleNumberCards = new ArrayList<DoubleNumberCard>();
        this.LongNumberCardAnzahl = 0;
        this.alleLongNumberCards = new ArrayList<LongNumberCard>();
    }

    public IntegerNumberCard createIntegerNumberCard(String question, Integer answer) {
            IntegerNumberCard integerNumberCard = new IntegerNumberCard(IntegerNumberCardAnzahl++, question, answer);
            alleIntegerNumberCards.add(integerNumberCard);
            return integerNumberCard;

    }

    public List<IntegerNumberCard> gebeAlleIntegerNumberCards() {
        return alleIntegerNumberCards;
    }

    public IntegerNumberCard updateIntegerNumberCard(Integer id, String question, Integer answer) {

        for (int i = 0; i<alleIntegerNumberCards.size(); i++) {
            IntegerNumberCard integerNumberCard = alleIntegerNumberCards.get(i);

            if (id.equals(integerNumberCard.getId())) {
                integerNumberCard.setQuestion(question);
                integerNumberCard.setAnswer(answer);
                return integerNumberCard;
            }
        }
        return null;
    }

    public Boolean deleteIntegerNumberCard(Integer id) { //Kann auch bei Learningcard angewendet werden-> also nur eine Methode
        for (int i = 0; i<alleIntegerNumberCards.size(); i++) {
            IntegerNumberCard integerNumberCard = alleIntegerNumberCards.get(i);

            if (id.equals(integerNumberCard.getId())) {
                alleIntegerNumberCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    //________________DoubleNumberCard_____________________

    public DoubleNumberCard createDoubleNumberCard(String question, Double answer) {
        DoubleNumberCard doubleNumberCard = new DoubleNumberCard(DoubleNumberCardAnzahl++, question, answer);
        alleDoubleNumberCards.add(doubleNumberCard);
        return doubleNumberCard;
    }

    public List<DoubleNumberCard> gebealleDoubleNumberCards() {
        return alleDoubleNumberCards;
    }

    public DoubleNumberCard updateDoubleNumberCard(Integer id, String question, Double answer) {
        for (int i = 0; i<alleDoubleNumberCards.size(); i++) {
            DoubleNumberCard doubleNumberCard = alleDoubleNumberCards.get(i);

            if (id.equals(doubleNumberCard.getId())) {
                doubleNumberCard.setQuestion(question);
                doubleNumberCard.setAnswer(answer);
                return doubleNumberCard;
            }
        }
        return null;
    }

    public Boolean deleteDoubleNumberCard(Integer id) {
        for (int i = 0; i<alleDoubleNumberCards.size(); i++) {
            DoubleNumberCard doubleNumberCard = alleDoubleNumberCards.get(i);

            if (id.equals(doubleNumberCard.getId())) {
                alleDoubleNumberCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    //________________LongNumberCard_____________________

    public LongNumberCard createLongNumberCard(String question, Long answer) {
        LongNumberCard longNumberCard = new LongNumberCard(DoubleNumberCardAnzahl++, question, answer);
        alleLongNumberCards.add(longNumberCard);
        return longNumberCard;
    }

    public List<LongNumberCard> gebealleLongNumberCards() {
        return alleLongNumberCards;
    }

    public LongNumberCard updateLongNumberCard(Integer id, String question, Long answer) {
        for (int i = 0; i<alleLongNumberCards.size(); i++) {
            LongNumberCard longNumberCard = alleLongNumberCards.get(i);

            if (id.equals(longNumberCard.getId())) {
                longNumberCard.setQuestion(question);
                longNumberCard.setAnswer(answer);
                return longNumberCard;
            }
        }
        return null;
    }

    public Boolean deleteLongNumberCard(Integer id) {
        for (int i = 0; i<alleLongNumberCards.size(); i++) {
            LongNumberCard longNumberCard = alleLongNumberCards.get(i);

            if (id.equals(longNumberCard.getId())) {
                alleLongNumberCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }
}
