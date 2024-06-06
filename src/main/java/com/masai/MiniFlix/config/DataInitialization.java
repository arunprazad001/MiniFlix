package com.masai.MiniFlix.config;

import com.masai.MiniFlix.dao.MovieDAO;
import com.masai.MiniFlix.dao.SeriesDAO;
import com.masai.MiniFlix.entity.Movie;
import com.masai.MiniFlix.entity.Series;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataInitialization {
    private final MovieDAO movieDAO;
    private final SeriesDAO seriesDAO;

    @Autowired
    public DataInitialization(MovieDAO movieDAO, SeriesDAO seriesDAO) {
        this.movieDAO = movieDAO;
        this.seriesDAO = seriesDAO;
    }
    @PostConstruct
    public void initData() {
        movieDAO.save(new Movie("InterStellar", "Sci-Fi", 148));
        movieDAO.save(new Movie("Mirzapur", "Crime", 175));

        seriesDAO.save(new Series("Peaky Blinders", "Drama", 5));
        seriesDAO.save(new Series("Stranger Things", "Sci-Fi", 4));
    }
}
