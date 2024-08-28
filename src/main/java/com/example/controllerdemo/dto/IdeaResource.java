package com.example.controllerdemo.dto;


import java.util.Objects;

public class IdeaResource {

    private int id ;
    private  String ideaTitle;
    private String ideaDescription;
    private String author;

    public IdeaResource() {
    }

    public IdeaResource(int id, String ideaTitle, String ideaDescription, String author) {
        this.id = id;
        this.ideaTitle = ideaTitle;
        this.ideaDescription = ideaDescription;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdeaTitle() {
        return ideaTitle;
    }

    public void setIdeaTitle(String ideaTitle) {
        this.ideaTitle = ideaTitle;
    }

    public String getIdeaDescription() {
        return ideaDescription;
    }

    public void setIdeaDescription(String ideaDescription) {
        this.ideaDescription = ideaDescription;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "IdeaResource{" +
                "id=" + id +
                ", ideaTitle='" + ideaTitle + '\'' +
                ", ideaDescription='" + ideaDescription + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdeaResource that = (IdeaResource) o;
        return id == that.id && Objects.equals(ideaTitle, that.ideaTitle) && Objects.equals(ideaDescription, that.ideaDescription) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaTitle, ideaDescription, author);
    }
}
