package com.example.WebProgAssignment3.service;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.MultipleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.DoubleNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.IntegerNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.LongNumberCard;
import com.example.WebProgAssignment3.LearningCard.SingleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CardService {
    private Integer cardsAnzahl;
    private List<IntegerNumberCard> alleIntegerNumberCards;
    private List<DoubleNumberCard> alleDoubleNumberCards;
    private List<LongNumberCard> alleLongNumberCards;
    private List<TextCard> alleTextCards;
    private List<SingleChoiceCard> alleSingleChoiceCards;
    private List<MultipleChoiceCard> alleMultipleChoiceCards;
    private List<LearningCard> alleCards;

    public CardService() {
        this.cardsAnzahl = 0;
        this.alleTextCards = new ArrayList<TextCard>();
        this.alleSingleChoiceCards = new ArrayList<SingleChoiceCard>();
        this.alleMultipleChoiceCards = new ArrayList<MultipleChoiceCard>();
        this.alleCards = new ArrayList<LearningCard>();
        this.alleIntegerNumberCards = new ArrayList<IntegerNumberCard>();
        this.alleDoubleNumberCards = new ArrayList<DoubleNumberCard>();
        this.alleLongNumberCards = new ArrayList<LongNumberCard>();
    }

    public List<LearningCard> gebeAlleCards() {
        return alleCards;
    }

    //_________________TextCard____________________//

    public TextCard createTextCard(String question, String answer) {
        TextCard textCard = new TextCard(cardsAnzahl++, question, answer);
        alleTextCards.add(textCard);
        alleCards.add(textCard);
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

    public Boolean deleteTextCard(Integer id) {
        for (int i = 0; i < alleTextCards.size(); i++) {
            TextCard textCard = alleTextCards.get(i);

            if (id.equals(textCard.getId())) {
                alleTextCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    public Boolean checkTextCardAnswer(Integer id, String answer) {
        for (int i = 0; i < alleTextCards.size(); i++) {
            TextCard textCard = alleTextCards.get(i);

            if (id.equals(textCard.getId())) {
                return textCard.checkUserAnswer(answer);
            }
        }
        return false;
    }

    //_____________________SingleChoiceTextCard_______//

    public SingleChoiceCard createSingleChoiceTextCard(String question, List<String> answers, Integer rightAnswer) {
        SingleChoiceCard singleChoiceCard = new SingleChoiceCard(cardsAnzahl++, question, answers, rightAnswer);
        alleSingleChoiceCards.add(singleChoiceCard);
        alleCards.add(singleChoiceCard);
        return singleChoiceCard;
    }

    public List<SingleChoiceCard> gebealleSingleChoiceTextCards() {
        return alleSingleChoiceCards;
    }

    public SingleChoiceCard updateSingleChoice(Integer id, String question, List<String> answers, Integer rightAnswer) {

        for (int i = 0; i<alleSingleChoiceCards.size(); i++) {
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);

            if (id.equals(singleChoiceCard.getId())) {
                singleChoiceCard.setQuestion(question);
                singleChoiceCard.setAnswers(answers);
                singleChoiceCard.setRightAnswer(rightAnswer);
                return singleChoiceCard;
            }
        }
        return null;
    }

    public Boolean deleteSingleChoice(Integer id) {
        for (int i = 0; i < alleSingleChoiceCards.size(); i++) {
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);

            if (id.equals(singleChoiceCard.getId())) {
                alleSingleChoiceCards.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    public Boolean checkSingleChoiceAnswer(Integer id, Integer rightAnswer) {
        for (int i = 0; i < alleSingleChoiceCards.size(); i++) {
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);

            if (id.equals(singleChoiceCard.getId())) {
                return singleChoiceCard.checkUserAnswer(rightAnswer);
            }
        }
        return false;
    }

    //_____________________MultipleChoiceTextCard_______//

    public MultipleChoiceCard createMultipleChoiceTextCard(String question, List<String> answers, List<Integer> rightAnswers) {
        MultipleChoiceCard multipleChoiceCard = new MultipleChoiceCard(cardsAnzahl++, question, answers, rightAnswers);
        alleMultipleChoiceCards.add(multipleChoiceCard);
        alleCards.add(multipleChoiceCard);
        return multipleChoiceCard;
    }

    public List<MultipleChoiceCard> gebealleMutipleChoiceTextCards() {
        return alleMultipleChoiceCards;
    }

    public MultipleChoiceCard updateMutipleChoice(Integer id, String question, List<String> answers, List<Integer> rightAnswers) {
        for (int i = 0; i<alleMultipleChoiceCards.size(); i++) {
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i);

            if (id.equals(multipleChoiceCard.getId())) {
                multipleChoiceCard.setQuestion(question);
                multipleChoiceCard.setAnswers(answers);
                multipleChoiceCard.setRightAnswers(rightAnswers);
                return multipleChoiceCard;
            }
        }
        return null;
    }

    public Boolean deleteMultipleChoice(Integer id) {
        for (int i = 0; i < alleMultipleChoiceCards.size(); i++) {
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i);

            if (id.equals(multipleChoiceCard.getId())) {
                alleMultipleChoiceCards.remove(multipleChoiceCard);
                return true;
            }
        }
        return false;
    }

    public Boolean checkMultipleChoiceAnswer(Integer id, List<Integer> rightAnswers) {
        for (int i = 0; i < alleMultipleChoiceCards.size(); i++) {
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i);

            if (id.equals(multipleChoiceCard.getId())) {
                return multipleChoiceCard.checkUserAnswer(rightAnswers);
            }
        }
        return false;
    }

    //_________________IntNumberCard____________________//

    public IntegerNumberCard createIntegerNumberCard(String question, Integer answer) {
        IntegerNumberCard integerNumberCard = new IntegerNumberCard(cardsAnzahl++, question, answer);
        alleIntegerNumberCards.add(integerNumberCard);
        alleCards.add(integerNumberCard);
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
        DoubleNumberCard doubleNumberCard = new DoubleNumberCard(cardsAnzahl++, question, answer);
        alleDoubleNumberCards.add(doubleNumberCard);
        alleCards.add(doubleNumberCard);
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
        LongNumberCard longNumberCard = new LongNumberCard(cardsAnzahl++, question, answer);
        alleLongNumberCards.add(longNumberCard);
        alleCards.add(longNumberCard);
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
