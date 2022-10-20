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

    @PostMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard createTextCard(@RequestBody TextCardCreationRequest textCardCreationRequest) {
        return cardService.createTextCard(textCardCreationRequest.getQuestion(), textCardCreationRequest.getAnswer());
    }

    @GetMapping(value = "/alletextcards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TextCard> gebeAlleTextCards() {
        return cardService.gebeAlleTextCards();
    }

    @PatchMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard updateTextCard(@RequestBody TextCardUpdateRequest textCardUpdateRequest) {
        return cardService.updateTextCard(textCardUpdateRequest.getId(), textCardUpdateRequest.getQuestion(), textCardUpdateRequest.getAnswer());
    }

    @DeleteMapping(value = "/textcard/{id}")
    public Boolean deleteTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteTextCard(id);
    }

    @PostMapping(value ="/textcardcheck/{id}")
    public Boolean checkTextCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "answer") String answer) {
        return cardService.checkTextCardAnswer(id, answer);
    }

    //____________________SingleChoice______________________//

    @PostMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard createSingleChoiceTextCard(@RequestBody SingleChoiceCreationRequest singleChoiceCreationRequest) {
        return cardService.createSingleChoiceTextCard(singleChoiceCreationRequest.getQuestion(), singleChoiceCreationRequest.getAnswers(), singleChoiceCreationRequest.getRightAnswer());
    }

    @GetMapping(value = "/textcard/allesinglechoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SingleChoiceCard> alleSingleChoiceTextCard() {
        return cardService.gebealleSingleChoiceTextCards();
    }

    @PatchMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard updateSingleTextCard(@RequestBody SingleChoiceUpdateRequest singleChoiceUpdateRequest) {
        return cardService.updateSingleChoice(singleChoiceUpdateRequest.getId(), singleChoiceUpdateRequest.getQuestion(), singleChoiceUpdateRequest.getAnswers(), singleChoiceUpdateRequest.getRightAnswer());
    }

    @DeleteMapping(value = "/textcard/singlechoice/{id}")
    public Boolean deleteSingleChoiceTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteSingleChoice(id);
    }

    @PostMapping(value ="/singlechoicecheck/{id}")
    public Boolean checkSingleChoiceAnswer(@PathVariable("id") Integer id, @RequestParam(value = "rightAnswer") Integer rightAnswer) {
        return cardService.checkSingleChoiceAnswer(id, rightAnswer);
    }

    //____________________MultipleChoice______________________//

    @PostMapping(value = "/textcard/multiplechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MultipleChoiceCard createMultipleChoiceTextCard(@RequestBody MultipleChoiceCreationRequest multipleChoiceCreationRequest) {
        return cardService.createMultipleChoiceTextCard(multipleChoiceCreationRequest.getQuestion(), multipleChoiceCreationRequest.getAnswers(), multipleChoiceCreationRequest.getRightAnswers());
    }

    @GetMapping(value = "/textcard/allemultiplechoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MultipleChoiceCard> alleMultipleChoiceTextCard() {
        return cardService.gebealleMutipleChoiceTextCards();
    }

    @PatchMapping(value = "/textcard/multiplechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MultipleChoiceCard updateMultipleTextCard(@RequestBody MultipleChoiceUpdateRequest multipleChoiceUpdateRequest) {
        return cardService.updateMutipleChoice(multipleChoiceUpdateRequest.getId(), multipleChoiceUpdateRequest.getQuestion(), multipleChoiceUpdateRequest.getAnswers(), multipleChoiceUpdateRequest.getRightAnswers());
    }

    @DeleteMapping(value = "/textcard/multiplechoice/{id}")
    public Boolean deleteMultipleChoiceTextCard(@PathVariable("id") Integer id) {
        return cardService.deleteMultipleChoice(id);
    }

    @PostMapping(value ="/multiplechoicecheck/{id}")
    public Boolean checkMultipleChoiceAnswer(@PathVariable("id") Integer id, @RequestParam(value = "rightAnswers") List<Integer> rightAnswers) {
        return cardService.checkMultipleChoiceAnswer(id, rightAnswers);
    }
}
