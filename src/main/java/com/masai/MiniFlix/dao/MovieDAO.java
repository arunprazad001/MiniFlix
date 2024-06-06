package com.masai.MiniFlix.dao;

import com.masai.MiniFlix.entity.Movie;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class MovieDAO {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> findAll() {
        return movies;
    }

    public void save(Movie movie) {
        movies.add(movie);
    }

    public void update(int id, Movie updatedMovie) {
        movies.set(id, updatedMovie);
    }

    public Movie findById(int id) {
        return movies.get(id);
    }

    public void delete(int id) {
        movies.remove(id);
    }
}
