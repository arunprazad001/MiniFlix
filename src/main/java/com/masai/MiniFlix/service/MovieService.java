package com.masai.MiniFlix.service;

import com.masai.MiniFlix.dao.MovieDAO;
import com.masai.MiniFlix.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MovieService {
    @Autowired
    private MovieDAO movieDAO;

    public List<Movie> getAllMovies() {
        return movieDAO.findAll();
    }

    public void addMovie(Movie movie) {
        movieDAO.save(movie);
    }

    public void updateMovie(int id, Movie movie) {
        movieDAO.update(id, movie);
    }

    public Movie getMovieById(int id) {
        return movieDAO.findById(id);
    }

    public void deleteMovie(int id) {
        movieDAO.delete(id);
    }
}
