package com.sadykov;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class JsonReader {
    private static Gson gson = new Gson();

    public static List<Movie> getMovies() throws IOException {
        try (Reader reader = new FileReader("Movies.json")) {
            List<Movie> movies = List.of(gson.fromJson(reader, Movie[].class));
            return movies;
        }
    }
}
