package com.example.WebProgAssignment3.controller;

import com.example.WebProgAssignment3.LearningCard.SingleChoiceCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import com.example.WebProgAssignment3.controller.request.SingleChoiceCreationRequest;
import com.example.WebProgAssignment3.controller.request.SingleChoiceUpdateRequest;
import com.example.WebProgAssignment3.controller.request.TextCardCreationRequest;
import com.example.WebProgAssignment3.controller.request.TextCardUpdateRequest;
import com.example.WebProgAssignment3.service.TextCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TextCardController {

    @Autowired
    public TextCardController(TextCardService textCardService) {
        this.textCardService = textCardService;
    }

    private final TextCardService textCardService;

    @PostMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard createTextCard(@RequestBody TextCardCreationRequest textCardCreationRequest) {
        return textCardService.createTextCard(textCardCreationRequest.getQuestion(), textCardCreationRequest.getAnswer());
    }

    @GetMapping(value = "/alletextcards", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TextCard> gebeAlleTextCards() {
        return textCardService.gebeAlleTextCards();
    }

    @PatchMapping(value = "/textcard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard updateTextCard(@RequestBody TextCardUpdateRequest textCardUpdateRequest) {
        return textCardService.updateTextCard(textCardUpdateRequest.getId(), textCardUpdateRequest.getQuestion(), textCardUpdateRequest.getAnswer());
    }

    @DeleteMapping(value = "/textcard/{id}")
    public Boolean deleteTextCard(@PathVariable("id") Integer id) {
        return textCardService.deleteTextCard(id);
    }

    @PostMapping(value ="/textcardcheck/{id}") //Checking
    public Boolean checkTextCardAnswer() {
        public textCardService.checkTextCardAnswer(@PathVariable("id") Integer id, @RequestParam(value = "antwort") String answer);
    }

    //____________________EinfachAuswahl______________________//

    @PostMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard createSingleChoiceTextCard(@RequestBody SingleChoiceCreationRequest singleChoiceCreationRequest) {
        return textCardService.createSingleChoiceTextCard(singleChoiceCreationRequest.getQuestion(), singleChoiceCreationRequest.getAnswers(), singleChoiceCreationRequest.getUserAnswer(), singleChoiceCreationRequest.getRightAnswer());
    }

    @GetMapping(value = "/textcard/allesinglechoice", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SingleChoiceCard> alleSingleChoiceTextCard() {
        return textCardService.gebealleSingleChoiceTextCards();
    }

    @PatchMapping(value = "/textcard/singlechoice", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SingleChoiceCard updateTextCard(@RequestBody SingleChoiceUpdateRequest singleChoiceUpdateRequest) {
        return textCardService.updateSingleChoice(singleChoiceUpdateRequest.getId(), singleChoiceUpdateRequest.getQuestion(), singleChoiceUpdateRequest.getAnswers(), singleChoiceUpdateRequest.getRightAnswer(), singleChoiceUpdateRequest.getUserAnswer());
    }

    @DeleteMapping(value = "/textcard/singlechoice/{id}")
    public Boolean deleteSingleChoiceTextCard(@PathVariable("id") Integer id) {
        return textCardService.deleteTextCard(id);
    }


}
