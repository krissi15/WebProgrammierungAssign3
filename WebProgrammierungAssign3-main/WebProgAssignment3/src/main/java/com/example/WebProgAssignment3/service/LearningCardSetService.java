package com.example.WebProgAssignment3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.LearningCardSet;
import org.springframework.stereotype.Service;

@Service
public class LearningCardSetService {
    private Integer learningCardSetAnzahl;
    private String name;
    private List<LearningCardSet> alleLearningCardSets;

    public LearningCardSetService() {
        this.learningCardSetAnzahl = 0;
        this.alleLearningCardSets = new ArrayList<LearningCardSet>();
    }

    public LearningCardSet createLearningCardSet(String name) {
        LearningCardSet learningCardSet = new LearningCardSet(learningCardSetAnzahl++, name); //Erstellung LearningCardSet
        alleLearningCardSets.add(learningCardSet);  //Hinzufügen in ein LearningCardSetArray
        return learningCardSet;                     //Rückgabe das erstelle LearningCardSet
    }

    public List<LearningCardSet> gebeAlleLearningCardSets() {
        return alleLearningCardSets;
    }

    public LearningCardSet updateLearningCardSet(Integer id, String name) {

        for (int i = 0; i<alleLearningCardSets.size(); i++) {               //Suche nach einem bestimmten LearningCardSet
            LearningCardSet learningCardSet = alleLearningCardSets.get(i);  //Suche nach einem bestimmten LearningCardSet

            if (id.equals(learningCardSet.getId())) {   //Suche nach einem bestimmten LearningCardSet
                learningCardSet.setId(id);              //Aktualisierung ID in dem LearningCardSet
                learningCardSet.setName(name);          //Aktualisierung Name in dem LearningCardSet
                return learningCardSet;                 //Rückgabe das aktualisierte LearningCardSet
            }
        }
        return null;
    }

    public Boolean deleteLearningCardSet(Integer id) {
        for (int i = 0; i < alleLearningCardSets.size(); i++) {             //Suche nach einem bestimmten LearningCardSet
            LearningCardSet learningCardSet = alleLearningCardSets.get(i);  //Suche nach einem bestimmten LearningCardSet

            if (id.equals(learningCardSet.getId())) {           //Suche nach einem bestimmten LearningCardSet
                alleLearningCardSets.remove(learningCardSet);     //Entferne LearningCardSet aus LearningCardSetArray
                return true;
            }
        }
        return false;
    }

    public Boolean addCard(Integer idCard, Integer idLearningCardSet) {
        for (int i = 0; i<alleLearningCardSets.size(); i++) {                       //Suche nach einem bestimmten LearningCardSet
            if (idLearningCardSet.equals(alleLearningCardSets.get(i).getId())) {    //Suche nach einem bestimmten LearningCardSet
                alleLearningCardSets.get(i).addCard(idCard);                        //Fügt Card zum Set hinzu
                return true;
            }
        }
        return false;
    }

    public Boolean removeCard(Integer idCard, Integer idLearningCardSet) {
        for (int i = 0; i<alleLearningCardSets.size(); i++) {                       //Suche nach einem bestimmten LearningCardSet
            if (idLearningCardSet.equals(alleLearningCardSets.get(i).getId())) {    //Suche nach einem bestimmten LearningCardSet
                alleLearningCardSets.get(i).removeCard(idCard);                     //Entfernt Card von Set
                return true;
            }
        }
        return false;
    }

    public List<LearningCard> gebealleCardsinSets(Integer idLearningCardSet, CardService alleCards) {
        List<LearningCard> tempReturn = new ArrayList<LearningCard>();          //Erstellung neue ArrayList für die Cards in dem Set
        for (int i = 0; i<alleLearningCardSets.size(); i++) {        //Suche nach bestimmten Set
            if (idLearningCardSet.equals(alleLearningCardSets.get(i).getId())) {    //Suche nach bestimmten Set
                LearningCardSet var = alleLearningCardSets.get(i);                  //Neue Variable für Speicher
                for (Integer idCards: var.getCards()) {                             //Suche bestimmte Card
                    tempReturn.add(alleCards.gebeCardFromId(var.getCards().get(idCards.intValue())));   //Füge Card im Array hinzu
                }
            }
        }
        return tempReturn;      //Rückgabe das erstellte Array mit Cards im Set
    }
}
