package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.LearningCard;
import com.example.WebProgAssignment3.LearningCard.MultipleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.SingleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import com.example.WebProgAssignment3.controller.request.*;
import com.example.WebProgAssignment3.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextCardController {

    @Autowired
    public TextCardController(CardService cardService) {
        this.cardService = cardService;
    }

    private final CardService cardService;

    @GetMapping(value = "/allelearningcards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LearningCard> gebeAlleCards() {
        return cardService.gebeAlleCards();
    }

    //___________________TextCard____________________//

    //Create TextCard
    @PostMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard createTextCard(@RequestBody TextCardCreationRequest textCardCreationRequest) {
        return cardService.createTextCard(textCardCreationRequest.getQuestion(), textCardCreationRequest.getAnswer(), textCardCreationRequest.getLearningZyklus());
    }

    //Gibt alle TextCards aus
    @GetMapping(value = "/alletextcards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TextCard> gebeAlleTextCards() {
        return cardService.gebeAlleTextCards();
    }

    //Update TextCard
    @PatchMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard updateTextCard(@RequestBody TextCardUpdateRequest textCardUpdateRequest) {
        return cardService.updateTextCard(textCardUpdateRequest.getId(), textCardUpdateRequest.getQuestion(), textCardUpdateRequest.getAnswer(), textCardUpdateRequest.getLearningZyklus());
    }

    //Delete TextCard
    @DeleteMapping(value = "/textcard/{id}")
    public Boolean deleteTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteTextCard(id);
    }

    //Checkt Antwort von TextCard
    @PostMapping(value ="/textcardcheck/{id}")
    public Boolean checkTextCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "answer") String answer) {
        return cardService.checkTextCardAnswer(id, answer);
    }

    //____________________SingleChoice______________________//

    //Create SingleChoiceChoice
    @PostMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard createSingleChoiceTextCard(@RequestBody TextCardCreationRequest textCardSingleCreationRequest) {
        return cardService.createSingleChoiceTextCard(textCardSingleCreationRequest.getQuestion(), textCardSingleCreationRequest.getAnswers(), textCardSingleCreationRequest.getRightAnswer(), textCardSingleCreationRequest.getLearningZyklus());
    }

    //Gibt alle SingleChoiceCards aus
    @GetMapping(value = "/textcard/allesinglechoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SingleChoiceCard> alleSingleChoiceTextCard() {
        return cardService.gebealleSingleChoiceTextCards();
    }

    //Update SingleChoiceChoice
    @PatchMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard updateSingleTextCard(@RequestBody TextCardUpdateRequest textCardSingleUpdateRequest) {
        return cardService.updateSingleChoice(textCardSingleUpdateRequest.getId(), textCardSingleUpdateRequest.getQuestion(), textCardSingleUpdateRequest.getAnswers(), textCardSingleUpdateRequest.getRightAnswer(), textCardSingleUpdateRequest.getLearningZyklus());
    }

    //Delete SingleChoiceChoice
    @DeleteMapping(value = "/textcard/singlechoice/{id}")
    public Boolean deleteSingleChoiceTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteSingleChoice(id);
    }

    //Checkt Antwort von SingleChoiceCard
    @PostMapping(value ="/singlechoicecheck/{id}")
    public Boolean checkSingleChoiceAnswer(@PathVariable("id") Integer id, @RequestParam(value = "rightAnswer") Integer rightAnswer) {
        return cardService.checkSingleChoiceAnswer(id, rightAnswer);
    }

    //____________________MultipleChoice______________________//

    //Create MultipleChoice
    @PostMapping(value = "/textcard/multiplechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MultipleChoiceCard createMultipleChoiceTextCard(@RequestBody TextCardCreationRequest textCardMultipleCreationRequest) {
        return cardService.createMultipleChoiceTextCard(textCardMultipleCreationRequest.getQuestion(), textCardMultipleCreationRequest.getAnswers(), textCardMultipleCreationRequest.getRightAnswers(), textCardMultipleCreationRequest.getLearningZyklus());
    }

    //Gibt alle MultipleChoiceCards aus
    @GetMapping(value = "/textcard/allemultiplechoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MultipleChoiceCard> alleMultipleChoiceTextCard() {
        return cardService.gebealleMutipleChoiceTextCards();
    }

    //Update MultipleChoice
    @PatchMapping(value = "/textcard/multiplechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MultipleChoiceCard updateMultipleTextCard(@RequestBody TextCardUpdateRequest textCardMultipleUpdateRequest) {
        return cardService.updateMutipleChoice(textCardMultipleUpdateRequest.getId(), textCardMultipleUpdateRequest.getQuestion(), textCardMultipleUpdateRequest.getAnswers(), textCardMultipleUpdateRequest.getRightAnswers(), textCardMultipleUpdateRequest.getLearningZyklus());
    }

    //Delete MultipleChoice
    @DeleteMapping(value = "/textcard/multiplechoice/{id}")
    public Boolean deleteMultipleChoiceTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteMultipleChoice(id);
    }

    //Checkt Antwort von MultipleChoiceCard
    @PostMapping(value ="/multiplechoicecheck/{id}")
    public Boolean checkMultipleChoiceAnswer(@PathVariable("id") Integer id, @RequestParam(value = "rightAnswers") List<Integer> rightAnswers) {
        return cardService.checkMultipleChoiceAnswer(id, rightAnswers);
    }
}
