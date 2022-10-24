package com.example.WebProgAssignment3.service;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.MultipleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.DoubleNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.IntegerNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.LongNumberCard;
import com.example.WebProgAssignment3.LearningCard.SingleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public TextCard createTextCard(String question, String answer, Integer learningZyklus) {
        TextCard textCard = new TextCard(cardsAnzahl++, question, answer, learningZyklus);   //Erstellung TextCard
        alleTextCards.add(textCard);    //TextCard wird zur ArrayList für alle TextCards hinzugefügt
        alleCards.add(textCard);        //TextCard wird zur ArrayList für alle LearningCards hinzugefügt
        return textCard;                //Ausgabe erstellte TextCard
    }

    public List<TextCard> gebeAlleTextCards() {
        return alleTextCards;
    }

    public TextCard updateTextCard(Integer id, String question, String answer, Integer learningZyklus) {

        for (int i = 0; i<alleTextCards.size(); i++) {  //Suche nach einer bestimmten TextCard
            TextCard textCard = alleTextCards.get(i);   //Suche nach einer bestimmten TextCard --> Alternative for-each-Schleife

            if (id.equals(textCard.getId())) {              //Suche nach einer bestimmten TextCard
                textCard.setQuestion(question);             //Aktualisierung der Frage von der TextCard
                textCard.setAnswer(answer);                 //Aktualisierung der Antwort von der TextCard
                textCard.setLearningZyklus(learningZyklus); //Aktualisierung des Learningzyklus von der TextCard
                return textCard;                            //Ausgabe der aktualisierten TextCard
            }
        }
        return null;
    }

    public Boolean deleteTextCard(Integer id) {
        for (int i = 0; i < alleTextCards.size(); i++) {//Suche nach einer bestimmten TextCard
            TextCard textCard = alleTextCards.get(i);   //Suche nach einer bestimmten TextCard --> Alternative for-each-Schleife

            if (id.equals(textCard.getId())) {          //Suche nach einer bestimmten TextCard
                alleTextCards.remove(textCard);    //TextCard wird von TextCardArray entfernt
                alleCards.remove(textCard);        //TextCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkTextCardAnswer(Integer id, String answer) {
        for (int i = 0; i < alleTextCards.size(); i++) {    //Suche nach einer bestimmten TextCard
            TextCard textCard = alleTextCards.get(i);       //Suche nach einer bestimmten TextCard

            if (id.equals(textCard.getId())) {              //Suche nach einer bestimmten TextCard
                return textCard.checkUserAnswer(answer);    //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    //_____________________SingleChoiceTextCard_______//

    public SingleChoiceCard createSingleChoiceTextCard(String question, List<String> answers, Integer rightAnswer, Integer learningZyklus) {
        SingleChoiceCard singleChoiceCard = new SingleChoiceCard(cardsAnzahl++, question, answers, rightAnswer, learningZyklus);    //Erstellung SingleChoiceCard
        alleSingleChoiceCards.add(singleChoiceCard);    //SingleChoiceCard wird zur ArrayList für alle SingleChoiceCards hinzugefügt
        alleCards.add(singleChoiceCard);                //SingleChoiceCard wird zur ArrayList für alle LearningCards hinzugefügt
        return singleChoiceCard;                        //Ausgabe erstellte SingleChoiceCard
    }

    public List<SingleChoiceCard> gebealleSingleChoiceTextCards() {
        return alleSingleChoiceCards;
    }

    public SingleChoiceCard updateSingleChoice(Integer id, String question, List<String> answers, Integer rightAnswer, Integer learningZyklus) {

        for (int i = 0; i<alleSingleChoiceCards.size(); i++) {                  //Suche nach einer bestimmten SingleChoiceCard
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);   //Suche nach einer bestimmten SingleChoiceCard --> Alternative for-each-Schleife

            if (id.equals(singleChoiceCard.getId())) {              //Suche nach einer bestimmten SingleChoiceCard
                singleChoiceCard.setQuestion(question);             //Aktualisierung der Frage von der SingleChoiceCard
                singleChoiceCard.setAnswers(answers);               //Aktualisierung der Antwort von der SingleChoiceCard
                singleChoiceCard.setRightAnswer(rightAnswer);       //Aktualisierung der richtigen Antwort von der SingleChoiceCard
                singleChoiceCard.setLearningZyklus(learningZyklus); //Aktualisierung des Learningzyklus von der SingleChoiceCard
                return singleChoiceCard;                            //Ausgabe der aktualisierten SingleChoiceCard
            }
        }
        return null;
    }

    public Boolean deleteSingleChoice(Integer id) {
        for (int i = 0; i < alleSingleChoiceCards.size(); i++) {                //Suche nach einer bestimmten SingleChoiceCard
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);   //Suche nach einer bestimmten SingleChoiceCard

            if (id.equals(singleChoiceCard.getId())) {          //Suche nach einer bestimmten SingleChoiceCard
                alleSingleChoiceCards.remove(singleChoiceCard);    //SingleChoiceCard wird von SingleChoiceCardArray entfernt
                alleCards.remove(singleChoiceCard);                //SingleChoiceCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkSingleChoiceAnswer(Integer id, Integer rightAnswer) {
        for (int i = 0; i < alleSingleChoiceCards.size(); i++) {                //Suche nach einer bestimmten SingleChoiceCard
            SingleChoiceCard singleChoiceCard = alleSingleChoiceCards.get(i);   //Suche nach einer bestimmten SingleChoiceCard

            if (id.equals(singleChoiceCard.getId())) {                  //Suche nach einer bestimmten SingleChoiceCard
                return singleChoiceCard.checkUserAnswer(rightAnswer);   //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    //_____________________MultipleChoiceTextCard_______//

    public MultipleChoiceCard createMultipleChoiceTextCard(String question, List<String> answers, List<Integer> rightAnswers, Integer learningZyklus) {
        MultipleChoiceCard multipleChoiceCard = new MultipleChoiceCard(cardsAnzahl++, question, answers, rightAnswers, learningZyklus); //Erstellung MutipleChoiceCard
        alleMultipleChoiceCards.add(multipleChoiceCard);        //MultipleChoiceCard wird zur ArrayList für alle MutipleChoiceCards hinzugefügt
        alleCards.add(multipleChoiceCard);                      //MultipleChoiceCard wird zur ArrayList für alle LearningCards hinzugefügt
        return multipleChoiceCard;                              //Ausgabe erstellte MultipleChoiceCard
    }

    public List<MultipleChoiceCard> gebealleMutipleChoiceTextCards() {
        return alleMultipleChoiceCards;
    }

    public MultipleChoiceCard updateMutipleChoice(Integer id, String question, List<String> answers, List<Integer> rightAnswers, Integer learningZyklus) {
        for (int i = 0; i<alleMultipleChoiceCards.size(); i++) {                    //Suche nach einer bestimmten MultipleChoiceCard
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i); //Suche nach einer bestimmten MultipleChoiceCard

            if (id.equals(multipleChoiceCard.getId())) {                //Suche nach einer bestimmten MultipleChoiceCard
                multipleChoiceCard.setQuestion(question);               //Aktualisierung der Frage von der MultipleChoiceCard
                multipleChoiceCard.setAnswers(answers);                 //Aktualisierung der Antwort von der MultipleChoiceCard
                multipleChoiceCard.setRightAnswers(rightAnswers);       //Aktualisierung der richtigen Antwort von der MultipleChoiceCard
                multipleChoiceCard.setLearningZyklus(learningZyklus);   //Aktualisierung des Learningzyklus von der MultipleChoiceCard
                return multipleChoiceCard;                              //Ausgabe der aktualisierten MultipleChoiceCard
            }
        }
        return null;
    }

    public Boolean deleteMultipleChoice(Integer id) {
        for (int i = 0; i < alleMultipleChoiceCards.size(); i++) {                  //Suche nach einer bestimmten MultipleChoiceCard
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i); //Suche nach einer bestimmten MultipleChoiceCard

            if (id.equals(multipleChoiceCard.getId())) {            //Suche nach einer bestimmten MultipleChoiceCard
                alleMultipleChoiceCards.remove(multipleChoiceCard); //MultipleChoiceCard wird von MultipleChoiceCardArray entfernt
                alleCards.remove(multipleChoiceCard);               //MultipleChoiceCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkMultipleChoiceAnswer(Integer id, List<Integer> rightAnswers) {
        for (int i = 0; i < alleMultipleChoiceCards.size(); i++) {                  //Suche nach einer bestimmten IntegerNumberCard
            MultipleChoiceCard multipleChoiceCard = alleMultipleChoiceCards.get(i); //Suche nach einer bestimmten IntegerNumberCard

            if (id.equals(multipleChoiceCard.getId())) {                    //Suche nach einer bestimmten IntegerNumberCard
                return multipleChoiceCard.checkUserAnswer(rightAnswers);    //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    //_________________IntNumberCard____________________//

    public IntegerNumberCard createIntegerNumberCard(String question, Integer answer, Integer learningZyklus) {
        IntegerNumberCard integerNumberCard = new IntegerNumberCard(cardsAnzahl++, question, answer, learningZyklus);   //Erstellung IntegerNumberCard
        alleIntegerNumberCards.add(integerNumberCard);  //IntegerNumberCard wird zur ArrayList für alle IntegerNumberCards hinzugefügt
        alleCards.add(integerNumberCard);               //IntegerNumberCard wird zur ArrayList für alle LearningCards hinzugefügt
        return integerNumberCard;                       //Ausgabe erstellte IntegerNumberCard
    }

    public List<IntegerNumberCard> gebeAlleIntegerNumberCards() {
        return alleIntegerNumberCards;
    }

    public IntegerNumberCard updateIntegerNumberCard(Integer id, String question, Integer answer, Integer learningZyklus) {

        for (int i = 0; i<alleIntegerNumberCards.size(); i++) {                     //Suche nach einer bestimmten IntegerNumberCard
            IntegerNumberCard integerNumberCard = alleIntegerNumberCards.get(i);    //Suche nach einer bestimmten IntegerNumberCard

            if (id.equals(integerNumberCard.getId())) {                 //Suche nach einer bestimmten IntegerNumberCard
                integerNumberCard.setQuestion(question);                //Aktualisierung der Frage von der IntegerNumberCard
                integerNumberCard.setAnswer(answer);                    //Aktualisierung der Antwort von der IntegerNumberCard
                integerNumberCard.setLearningZyklus(learningZyklus);    //Aktualisierung des Learningzyklus von der IntegerNumberCard
                return integerNumberCard;                               //Ausgabe der aktualisierten IntegerNumberCard
            }
        }
        return null;
    }

    public Boolean deleteIntegerNumberCard(Integer id) {
        for (int i = 0; i<alleIntegerNumberCards.size(); i++) {                     //Suche nach einer bestimmten IntegerNumberCard
            IntegerNumberCard integerNumberCard = alleIntegerNumberCards.get(i);    //Suche nach einer bestimmten IntegerNumberCard

            if (id.equals(integerNumberCard.getId())) {         //Suche nach einer bestimmten IntegerNumberCard
                alleIntegerNumberCards.remove(integerNumberCard);   //IntegerNumberCard wird von IntegerNumberCardArray entfernt
                alleCards.remove(integerNumberCard);                //IntegerNumberCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkIntegerNumberCardAnswer(Integer id, Integer rightAnswer) {
        for (int i = 0; i < alleIntegerNumberCards.size(); i++) {                  //Suche nach einer bestimmten MultipleChoiceCard
            IntegerNumberCard integerNumberCard = alleIntegerNumberCards.get(i); //Suche nach einer bestimmten MultipleChoiceCard

            if (id.equals(integerNumberCard.getId())) {                    //Suche nach einer bestimmten MultipleChoiceCard
                return integerNumberCard.checkUserAnswer(rightAnswer);    //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    //________________DoubleNumberCard_____________________

    public DoubleNumberCard createDoubleNumberCard(String question, Double answer, Integer learningZyklus) {
        DoubleNumberCard doubleNumberCard = new DoubleNumberCard(cardsAnzahl++, question, answer, learningZyklus);  //Erstellung DoubleNumberCard
        alleDoubleNumberCards.add(doubleNumberCard);    //DoubleNumberCard wird zur ArrayList für alle DoubleNumberCards hinzugefügt
        alleCards.add(doubleNumberCard);                //DoubleNumberCard wird zur ArrayList für alle LearningCards hinzugefügt
        return doubleNumberCard;                        //Ausgabe erstellte DoubleNumberCard
    }

    public List<DoubleNumberCard> gebealleDoubleNumberCards() {
        return alleDoubleNumberCards;
    }

    public DoubleNumberCard updateDoubleNumberCard(Integer id, String question, Double answer, Integer learningZyklus) {
        for (int i = 0; i<alleDoubleNumberCards.size(); i++) {                  //Suche nach einer bestimmten DoubleNumberCard
            DoubleNumberCard doubleNumberCard = alleDoubleNumberCards.get(i);   //Suche nach einer bestimmten DoubleNumberCard

            if (id.equals(doubleNumberCard.getId())) {                  //Suche nach einer bestimmten DoubleNumberCard
                doubleNumberCard.setQuestion(question);                 //Aktualisierung der Frage von der DoubleNumberCard
                doubleNumberCard.setAnswer(answer);                     //Aktualisierung der Antwort von der DoubleNumberCard
                doubleNumberCard.setLearningZyklus(learningZyklus);     //Aktualisierung des Learningzyklus von der DoubleNumberCard
                return doubleNumberCard;                                //Ausgabe der aktualisierten DoubleNumberCard
            }
        }
        return null;
    }

    public Boolean deleteDoubleNumberCard(Integer id) {
        for (int i = 0; i<alleDoubleNumberCards.size(); i++) {                  //Suche nach einer bestimmten DoubleNumberCard
            DoubleNumberCard doubleNumberCard = alleDoubleNumberCards.get(i);   //Suche nach einer bestimmten DoubleNumberCard

            if (id.equals(doubleNumberCard.getId())) {          //Suche nach einer bestimmten DoubleNumberCard
                alleDoubleNumberCards.remove(doubleNumberCard);    //DoubleNumberCard wird von DoubleNumberCardArray entfernt
                alleCards.remove(doubleNumberCard);                //DoubleNumberCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkDoubleNumberCardAnswer(Integer id, Double rightAnswer) {
        for (int i = 0; i < alleDoubleNumberCards.size(); i++) {                  //Suche nach einer bestimmten DoubleNumberCard
            DoubleNumberCard doubleNumberCard = alleDoubleNumberCards.get(i); //Suche nach einer bestimmten DoubleNumberCard

            if (id.equals(doubleNumberCard.getId())) {                    //Suche nach einer bestimmten DoubleNumberCard
                return doubleNumberCard.checkUserAnswer(rightAnswer);    //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    //________________LongNumberCard_____________________

    public LongNumberCard createLongNumberCard(String question, Long answer, Integer learningZyklus) {
        LongNumberCard longNumberCard = new LongNumberCard(cardsAnzahl++, question, answer, learningZyklus);    //Erstellung LongNumberCard
        alleLongNumberCards.add(longNumberCard);    //LongNumberCard wird zur ArrayList für alle LongNumberCards hinzugefügt
        alleCards.add(longNumberCard);              //LongNumberCard wird zur ArrayList für alle LearningCards hinzugefügt
        return longNumberCard;                      //Ausgabe erstellte LongNumberCard
    }

    public List<LongNumberCard> gebealleLongNumberCards() {
        return alleLongNumberCards;
    }

    public LongNumberCard updateLongNumberCard(Integer id, String question, Long answer, Integer learningZyklus) {
        for (int i = 0; i<alleLongNumberCards.size(); i++) {                //Suche nach einer bestimmten LongNumberCard
            LongNumberCard longNumberCard = alleLongNumberCards.get(i);     //Suche nach einer bestimmten LongNumberCard

            if (id.equals(longNumberCard.getId())) {                //Suche nach einer bestimmten LongNumberCard
                longNumberCard.setQuestion(question);               //Aktualisierung der Frage von der LongNumberCard
                longNumberCard.setAnswer(answer);                   //Aktualisierung der Antwort von der LongNumberCard
                longNumberCard.setLearningZyklus(learningZyklus);   //Aktualisierung des Learningzyklus von der LongNumberCard
                return longNumberCard;                              //Ausgabe der aktualisierten LongNumberCard
            }
        }
        return null;
    }

    public Boolean deleteLongNumberCard(Integer id) {
        for (int i = 0; i<alleLongNumberCards.size(); i++) {                //Suche nach einer bestimmten LongNumberCard
            LongNumberCard longNumberCard = alleLongNumberCards.get(i);     //Suche nach einer bestimmten LongNumberCard

            if (id.equals(longNumberCard.getId())) {        //Suche nach einer bestimmten LongNumberCard
                alleLongNumberCards.remove(longNumberCard);  //LongNumberCard wird von LongNumberCardArray entfernt
                alleCards.remove(longNumberCard);            //LongNumberCard wird von LearningCardArray entfernt
                return true;
            }
        }
        return false;
    }

    public Boolean checkLongNumberCardAnswer(Integer id, Long rightAnswer) {
        for (int i = 0; i < alleLongNumberCards.size(); i++) {                  //Suche nach einer bestimmten LongNumberCard
            LongNumberCard longNumberCard = alleLongNumberCards.get(i); //Suche nach einer bestimmten LongNumberCard

            if (id.equals(longNumberCard.getId())) {                   //Suche nach einer bestimmten LongNumberCard
                return longNumberCard.checkUserAnswer(rightAnswer);    //Übergibt Answer in die Methode checkUserAnswer
            }
        }
        return false;
    }

    public LearningCard gebeCardFromId(Integer id) {
        for (int i =0; i<alleCards.size(); i++) {       //Suche eine bestimmte LearningCard
            if(id.equals(alleCards.get(i).getId())) {   //Suche eine bestimmte LearningCard
                return alleCards.get(i);                //Gebe LearningCard aus Array zurück
            }
        }
        return null;
    }
}
