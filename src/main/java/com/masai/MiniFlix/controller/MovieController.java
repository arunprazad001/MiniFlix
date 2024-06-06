package com.masai.MiniFlix.controller;

import com.masai.MiniFlix.entity.Movie;
import com.masai.MiniFlix.service.MovieService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/getAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/add")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @PutMapping("update/{id}")
    public void updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        movieService.updateMovie(id, movie);
    }

    @GetMapping("get/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return movieService.getMovieById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
    }
}
