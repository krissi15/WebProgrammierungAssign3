package de.krischkes.webprogrammierung.config.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BlogCreationRequest {
    @JsonProperty("title")
    private String title;
    @JsonProperty("text")
    private String text;
    @JsonProperty("author")
    private String author;
    @JsonProperty("createDate")
    private LocalDate createDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
