package com.example.WebProgAssignment3.controller;


import com.example.WebProgAssignment3.LearningCard.EinfachAuswahlCard;
import com.example.WebProgAssignment3.LearningCard.TextCard;
import com.example.WebProgAssignment3.controller.request.EinfachAuswahlCardCreationRequest;
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

    //____________________EinfachAuswahl______________________//

    @PostMapping(value = "/textcardeinfach", consumes = MediaType.APPLICATION_JSON_VALUE)
    public EinfachAuswahlCard createeinfachAuswahlTextCard(@RequestBody EinfachAuswahlCardCreationRequest einfachAuswahlCardCreationRequest) {
        return textCardService.createeinfachAuswahlTextCard(einfachAuswahlCardCreationRequest.getQuestion(), einfachAuswahlCardCreationRequest.getAnswer(), einfachAuswahlCardCreationRequest.getRightAnswer());
    }
}
