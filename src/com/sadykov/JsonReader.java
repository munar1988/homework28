package com.sadykov;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    private static Gson gson = new Gson();

    public static ArrayList<Movie> getMovies() throws IOException {
        try (Reader reader = new FileReader("Movies.json")) {
            Movie[] movies = gson.fromJson(reader, Movie[].class);
            ArrayList<Movie> movie = new ArrayList<>();
            for (Movie m : movies) {
                movie.add(m);
            }
            return movie;
        }
    }

    public static void writeMovies(List<Movie> movies) throws IOException {
        try (Writer writer = new FileWriter("Movies.json")) {
            String json = gson.toJson(movies);
            writer.write(json);
        }
    }
}
