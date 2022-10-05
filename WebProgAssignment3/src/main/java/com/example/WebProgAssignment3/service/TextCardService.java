package com.example.WebProgAssignment3.service;

import com.example.WebProgAssignment3.LearningCard.TextCard;
import org.springframework.stereotype.Service;

@Service
public class TextCardService {

    public TextCard createTextCard(String question, String answer) {
        TextCard textCard = new TextCard(question, answer);
        return textCard;
    }

}
