package com.example.WebProgAssignment3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.WebProgAssignment3.LearningCard.LearningCardSet;
import com.example.WebProgAssignment3.LearningCard.TextCard;
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
        LearningCardSet learningCardSet = new LearningCardSet(learningCardSetAnzahl++, name);
        alleLearningCardSets.add(learningCardSet);
        return learningCardSet;
    }

    public List<LearningCardSet> gebeAlleLearningCardSets() {
        return alleLearningCardSets;
    }

    public LearningCardSet updateLearningCardSet(Integer id, String name) {

        for (int i = 0; i<alleLearningCardSets.size(); i++) {
            LearningCardSet learningCardSet = alleLearningCardSets.get(i);

            if (id.equals(learningCardSet.getId())) {
                learningCardSet.setId(id);
                learningCardSet.setName(name);
                return learningCardSet;
            }
        }
        return null;
    }

    public Boolean deleteLearningCardSet(Integer id) {
        for (int i = 0; i < alleLearningCardSets.size(); i++) {
            LearningCardSet learningCardSet = alleLearningCardSets.get(i);

            if (id.equals(learningCardSet.getId())) {
                alleLearningCardSets.remove(id.intValue());
                return true;
            }
        }
        return false;
    }

    public Boolean addCard(Integer idCard, Integer idLearningCardSet) {
        for (int i = 0; i<alleLearningCardSets.size(); i++) {
            if (idLearningCardSet.equals(alleLearningCardSets.get(i).getId())) {
                alleLearningCardSets.get(i).addCard(idCard);
                return true;
            }
        }
        return false;
    }

    public Boolean removeCard(Integer idCard, Integer idLearningCardSet) {
        for (int i = 0; i<alleLearningCardSets.size(); i++) {
            if (idLearningCardSet.equals(alleLearningCardSets.get(i))) {
                alleLearningCardSets.get(i).removeCard(idCard);
                return true;
            }
        }
        return false;
    }
}
