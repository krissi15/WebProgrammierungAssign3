package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.NumberCard.DoubleNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.IntegerNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.LongNumberCard;
import com.example.WebProgAssignment3.controller.request.NumberCardCreationRequest;
import com.example.WebProgAssignment3.controller.request.NumberCardUpdateRequest;
import com.example.WebProgAssignment3.service.NumberCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NumberCardController {


    @Autowired
    public NumberCardController(NumberCardService numberCardService) {
        this.numberCardService = numberCardService;
    }

    private final NumberCardService numberCardService;

    //________________IntegerNumberCard_____________________

    @PostMapping(value = "/intnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public IntegerNumberCard createIntegerNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return numberCardService.createIntegerNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getIntAnswer());
    }

    @GetMapping(value = "/alleintnumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<IntegerNumberCard> gebeAlleIntegerNumberCards() {
        return numberCardService.gebeAlleIntegerNumberCards();
    }

    @PatchMapping(value = "/intnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public IntegerNumberCard updateIntegerNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return numberCardService.updateIntegerNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getIntAnswer());
    }

    @DeleteMapping(value = "/intnumbercard/{id}")
    public Boolean deleteIntegerNumberCard(@PathVariable("id") Integer id) {
        return numberCardService.deleteIntegerNumberCard(id);
    }

    //________________DoubleNumberCard_____________________

    @PostMapping(value = "/doublenumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public DoubleNumberCard createDoubleNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return numberCardService.createDoubleNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getDoubleAnswer());
    }

    @GetMapping(value = "/alledoublenumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DoubleNumberCard> gebeAlleDoubleNumberCards() {
        return numberCardService.gebealleDoubleNumberCards();
    }

    @PatchMapping(value = "/doublenumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public DoubleNumberCard updateDoubleNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return numberCardService.updateDoubleNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getDoubleAnswer());
    }

    @DeleteMapping(value = "/doublenumbercard/{id}")
    public Boolean deleteDoubleNumberCard(@PathVariable("id") Integer id) {
        return numberCardService.deleteDoubleNumberCard(id);
    }

    //________________LongNumberCard_____________________

    @PostMapping(value = "/longnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LongNumberCard createLongNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return numberCardService.createLongNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getLongAnswer());
    }

    @GetMapping(value = "/allelongnumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LongNumberCard> gebeAlleLongNumberCards() {
        return numberCardService.gebealleLongNumberCards();
    }

    @PatchMapping(value = "/longnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LongNumberCard updateLongNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return numberCardService.updateLongNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getLongAnswer());
    }

    @DeleteMapping(value = "/longnumbercard/{id}")
    public Boolean deleteLongNumberCard(@PathVariable("id") Integer id) {
        return numberCardService.deleteLongNumberCard(id);
    }

}
