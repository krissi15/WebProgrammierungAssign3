package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.LearningCardSet;
import com.example.WebProgAssignment3.controller.request.LearningCardSetCreationRequest;
import com.example.WebProgAssignment3.controller.request.LearningCardSetUpdateRequest;
import com.example.WebProgAssignment3.service.LearningCardSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearningCardSetController {

    @Autowired
    public LearningCardSetController(LearningCardSetService learningCardSetService) {
        this.learningCardSetService = learningCardSetService;
    }
    private final LearningCardSetService learningCardSetService;

    //Create LearningCardSet
    @PostMapping(value = "/learningcardset", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LearningCardSet createLearningCardSet(@RequestBody LearningCardSetCreationRequest learningCardSetCreationRequest) {
        return learningCardSetService.createLearningCardSet(learningCardSetCreationRequest.getName());
    }

    //Gibt alle LearningCardSets
    @GetMapping(value = "/allelearningcardsets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LearningCardSet> gebeAlleLearningCardSets() {
        return learningCardSetService.gebeAlleLearningCardSets();
    }

    //Update LearningCardSet
    @PatchMapping(value = "/learningcardset", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LearningCardSet updateLearningCardSet(@RequestBody LearningCardSetUpdateRequest learningCardSetUpdateRequest) {
        return learningCardSetService.updateLearningCardSet(learningCardSetUpdateRequest.getId(), learningCardSetUpdateRequest.getName());
    }

    //Delete LearningCardSet
    @DeleteMapping (value = "/learningcardset/{id}")
    public Boolean deleteLearningCardSet(@PathVariable("id") Integer id) {
        return learningCardSetService.deleteLearningCardSet(id);
    }

}
