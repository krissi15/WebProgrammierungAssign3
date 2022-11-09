package de.krischkes.webprogrammierung.config;

import com.fasterxml.jackson.databind.DatabindException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Blog {
    private Integer id;
    private String title;
    private String text;
    private LocalDate createDate;
    private String author;

    public Blog(Integer id, String title, String text, String author, LocalDate createDate) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.author = author;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
