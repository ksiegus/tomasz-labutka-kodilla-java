package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatternsMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String movieList = movies.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieList);

    }
}
