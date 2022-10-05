package com.example.WebProgAssignment3.controller;


import com.example.WebProgAssignment3.LearningCard.TextCard;
import com.example.WebProgAssignment3.controller.request.TextCardCreationRequest;
import com.example.WebProgAssignment3.service.TextCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextCardController {

    @Autowired
    public TextCardController(TextCardService textCardService) {
        this.textCardService = textCardService;
    }

    private final TextCardService textCardService;

    @PostMapping(value = "/textCard", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TextCard createTextCard(@RequestBody TextCardCreationRequest textCardCreationRequest) {
        return textCardService.createTextCard("asdas", "asdasd");
    }
}
