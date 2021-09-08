package com.sadykov;

public class Movie {
    private String name;
    private int year;
    private Director director;
    private Actor actor;
    private String role;

    public Movie(String name, int year, Director director, Actor actor, String role) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.actor = actor;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
