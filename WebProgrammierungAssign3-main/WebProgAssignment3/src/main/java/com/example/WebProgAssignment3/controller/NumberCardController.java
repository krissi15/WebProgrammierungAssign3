package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.NumberCard.DoubleNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.IntegerNumberCard;
import com.example.WebProgAssignment3.LearningCard.NumberCard.LongNumberCard;
import com.example.WebProgAssignment3.controller.request.NumberCardCreationRequest;
import com.example.WebProgAssignment3.controller.request.NumberCardUpdateRequest;
import com.example.WebProgAssignment3.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class NumberCardController {

    @Autowired
    public NumberCardController(CardService cardService) {
        this.cardService = cardService;
    }

    private final CardService cardService;

    //________________IntegerNumberCard_____________________

    //Create IntNumberCard
    @PostMapping(value = "/intnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public IntegerNumberCard createIntegerNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return cardService.createIntegerNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getIntAnswer(), numberCardCreationRequest.getLearningZyklus());
    }

    //Gibt alle IntNumberCards aus
    @GetMapping(value = "/alleintnumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<IntegerNumberCard> gebeAlleIntegerNumberCards() {
        return cardService.gebeAlleIntegerNumberCards();
    }

    //Update IntNumberCard
    @PatchMapping(value = "/intnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public IntegerNumberCard updateIntegerNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return cardService.updateIntegerNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getIntAnswer(), numberCardUpdateRequest.getLearningZyklus());
    }

    //Delete IntNumberCard
    @DeleteMapping(value = "/intnumbercard/{id}")
    public Boolean deleteIntegerNumberCard(@PathVariable("id") Integer id) {
        return cardService.deleteIntegerNumberCard(id);
    }

    //Checkt Antwort von IntegerNumberCard
    @PostMapping(value ="/intnumbercardcheck/{id}")
    public Boolean checkIntegerNumberCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "answer") Integer answer) {
        return cardService.checkIntegerNumberCardAnswer(id, answer);
    }

    //________________DoubleNumberCard_____________________

    //Create DoubleNumberCard
    @PostMapping(value = "/doublenumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public DoubleNumberCard createDoubleNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return cardService.createDoubleNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getDoubleAnswer(), numberCardCreationRequest.getLearningZyklus());
    }

    //Gibt alle DoubleNumberCards aus
    @GetMapping(value = "/alledoublenumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DoubleNumberCard> gebeAlleDoubleNumberCards() {
        return cardService.gebealleDoubleNumberCards();
    }

    //Update DoubleNumberCard
    @PatchMapping(value = "/doublenumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public DoubleNumberCard updateDoubleNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return cardService.updateDoubleNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getDoubleAnswer(), numberCardUpdateRequest.getLearningZyklus());
    }

    //Delete DoubleNumberCard
    @DeleteMapping(value = "/doublenumbercard/{id}")
    public Boolean deleteDoubleNumberCard(@PathVariable("id") Integer id) {
        return cardService.deleteDoubleNumberCard(id);
    }

    //Checkt Antwort von IntegerNumberCard
    @PostMapping(value ="/doublenumbercardcheck/{id}")
    public Boolean checkDoubleNumberCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "answer") Double answer) {
        return cardService.checkDoubleNumberCardAnswer(id, answer);
    }

    //________________LongNumberCard_____________________

    //Create LongNumberCard
    @PostMapping(value = "/longnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LongNumberCard createLongNumberCard(@RequestBody NumberCardCreationRequest numberCardCreationRequest) {
        return cardService.createLongNumberCard(numberCardCreationRequest.getQuestion(), numberCardCreationRequest.getLongAnswer(), numberCardCreationRequest.getLearningZyklus());
    }

    //Gibt alle LongNumberCards aus
    @GetMapping(value = "/allelongnumbercards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LongNumberCard> gebeAlleLongNumberCards() {
        return cardService.gebealleLongNumberCards();
    }

    //Update LongNumberCard
    @PatchMapping(value = "/longnumbercard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public LongNumberCard updateLongNumberCard(@RequestBody NumberCardUpdateRequest numberCardUpdateRequest) {
        return cardService.updateLongNumberCard(numberCardUpdateRequest.getId(), numberCardUpdateRequest.getQuestion(), numberCardUpdateRequest.getLongAnswer(), numberCardUpdateRequest.getLearningZyklus());
    }

    //Delete LongNumberCard
    @DeleteMapping(value = "/longnumbercard/{id}")
    public Boolean deleteLongNumberCard(@PathVariable("id") Integer id) {
        return cardService.deleteLongNumberCard(id);
    }

    //Checkt Antwort von IntegerNumberCard
    @PostMapping(value ="/longnumbercardcheck/{id}")
    public Boolean checkLongNumberCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "answer") Long answer) {
        return cardService.checkLongNumberCardAnswer(id, answer);
    }

}
