package com.example.WebProgAssignment3.LearningCard;

import java.util.ArrayList;
import java.util.List;

public class LearningCardSet {
    private Integer id;
    private String name;
    private List<Integer> cards;

    public LearningCardSet(Integer id, String name) {
        this.id = id;
        this.name = name;
        cards = new ArrayList<Integer>();
    }

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

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }

    public void addCard(Integer id) {
        cards.add(id);
    }

    public void removeCard(Integer id) {
        cards.remove(id.intValue());
    }
}
