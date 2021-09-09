package com.sadykov;

public class Movie {
    private String nameCinema;
    private int year;
    private Director director;
    private Actor actor;
    private String role;

    public Movie(String nameCinema, int year, String fullName, String name, String role) {
    }

    public String getNameCinema() {
        return nameCinema;
    }

    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public Movie(String nameCinema, int year, Director director, Actor actor, String role) {
        this.nameCinema = nameCinema;
        this.year = year;
        this.director = director;
        this.actor = actor;
        this.role = role;
    }
}
