package com.sadykov;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class Main {
    private static Scanner sc;
    private static Object String;
    private static Object Movies;

    public static void main(String[] args) throws IOException {
        List<Movie> movies = JsonReader.getMovies();
        Movie movie = newMovie();
        movies.add(0, movie);

        for (Movie m : movies) {
            System.out.println(Movies.json());
        }

        // HashMap<String, String> map = new HashMap<String, String>();
        //  map.put("Начало", "Начало");
        // map.put("Нокдаун", "Нокдаун");
        // map.put("Самый пьяный округ в мире", "Самый пьяный округ в мире");
        //  map.put("Ford против Ferrari", "Ford против Ferrari");
        // map.put("В погоне за Бонни и Клайдом", "В погоне за Бонни и Клайдом");
       // printValues(map);
    //}

    //public static void printValues(Map<String, String> map)
  //  {
       // for(Map.Entry<String, String> pair : map.entrySet())
       // {
           // String value = pair.getValue();
           // System.out.println(value);
       //}
    //}
        
        System.out.println("Введи имя актера");
        String actor = sc.nextLine();
        List<Movie> filteredMoviesByActor = new ArrayList<>();
        for (Movie m : movies) {
            if (actor.equals(m.getActor())) {
                filteredMoviesByActor.add(m);
            }
        }

        System.out.println("Введи название фильма");
        String = sc.nextLine();
        List<Movie> filteredMoviesByNameCinema = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getNameCinema().contains(actor)) {
                filteredMoviesByNameCinema.add(m);
            }
        }

        System.out.println("Фильмы в которых снимался этот актер");
        for (Movie m : filteredMoviesByActor) {
            System.out.println(m.getActor());
        }
    }

    public static Movie newMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название фильма");
        String nameCinema = sc.nextLine();
        System.out.println("Введите год выпуска фильма");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Введите имя режиссера");
        String fullName = sc.nextLine();
        System.out.println("Введите имя актера");
        String name = sc.nextLine();
        System.out.println("Введите роли актеров");
        String role = sc.nextLine();
        Director director = new Director(fullName);
        Movie movie = new Movie(nameCinema, year, fullName, name, role);
        return movie;
    }
}

