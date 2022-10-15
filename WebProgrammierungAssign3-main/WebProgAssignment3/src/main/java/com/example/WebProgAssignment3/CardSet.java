package com.example.WebProgAssignment3;

import com.example.WebProgAssignment3.LearningCard.LearningCard;

import java.util.ArrayList;

public class CardSet {
    private Integer id;
    private String name;
    private ArrayList<LearningCard> cards = new ArrayList<LearningCard>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<LearningCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<LearningCard> cards) {
        this.cards = cards;
    }

    public void addLearningCard(LearningCard card) {

    }
}
