package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.LearningCardSet;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import com.example.WebProgAssignment3.controller.request.LearningCardSetCreationRequest;
import com.example.WebProgAssignment3.controller.request.TextCardCreationRequest;
import com.example.WebProgAssignment3.service.CardService;
import com.example.WebProgAssignment3.service.LearningCardSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CombinationController {

    @Autowired
    public CombinationController(CardService cardService, LearningCardSetService learningCardSetService) {
        this.cardService = cardService;
        this.learningCardSetService = learningCardSetService;
    }

    private final CardService cardService;
    private final LearningCardSetService learningCardSetService;

    //Create TextCard für Kombination Card und Set
    @PostMapping(value = "/combinationtextcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard createTextCard(@RequestBody TextCardCreationRequest textCardCreationRequest) {
        return cardService.createTextCard(textCardCreationRequest.getQuestion(), textCardCreationRequest.getAnswer(), textCardCreationRequest.getLearningZyklus());
    }

    //Create Set für Kombination Card und Set
    @PostMapping(value = "/combinationlearningcardset", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LearningCardSet createLearningCardSet(@RequestBody LearningCardSetCreationRequest learningCardSetCreationRequest) {
        return learningCardSetService.createLearningCardSet(learningCardSetCreationRequest.getName());
    }

    //List mit allen LearningCardSets
    @GetMapping(value = "/combinationallelearningcardsets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LearningCardSet> gebeAlleLearningCardSets() {
        return learningCardSetService.gebeAlleLearningCardSets();
    }

    //Card wird zu einem Set hinzugefügt
    @PostMapping(value = "/addcardtoset/{idCard}/{idLearningCardSet}")
    public Boolean addCard(@PathVariable("idCard") Integer idCard, @PathVariable("idLearningCardSet") Integer idLearningCardSet) {
        return learningCardSetService.addCard(idCard, idLearningCardSet);
    }

    //Card wird von einem Set entfernt
    @PostMapping("/removecardfromset/{idCard}/{idLearningCardSet}")
    public Boolean removeCard(@PathVariable("idCard") Integer idCard, @PathVariable("idLearningCardSet") Integer idLearningCardSet) {
        return learningCardSetService.removeCard(idCard, idLearningCardSet);
    }

    //Gibt alle Cards von einem Set
    @PostMapping(value = "/cardsfromset/{idLearningCardSet}")
    public List<LearningCard> gebeCardFromSet(@PathVariable("idLearningCardSet") Integer idLearningCardSet) {
        return learningCardSetService.gebealleCardsinSets(idLearningCardSet, cardService);
    }
}
