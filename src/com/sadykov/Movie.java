package com.sadykov;

public class Movie {
    private String name;
    private String Description;
    private Director director;

    public Movie(String name, String description, Director director) {
        this.name = name;
        Description = description;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
