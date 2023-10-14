package com.example.librarymanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookInput {

    private String title;
    private String category;
    private String author;


    public BookInput() {

    }

    public BookInput(@JsonProperty("title") String title , @JsonProperty("category") String category , @JsonProperty("author") String author) {

        this.title = title;
        this.category = category;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
