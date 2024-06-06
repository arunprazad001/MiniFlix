package com.masai.MiniFlix.config;

import com.masai.MiniFlix.dao.MovieDAO;
import com.masai.MiniFlix.dao.SeriesDAO;
import com.masai.MiniFlix.entity.Movie;
import com.masai.MiniFlix.entity.Series;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MovieDAO movieDAO() {
        return new MovieDAO();
    }

    @Bean
    public SeriesDAO seriesDAO() {
        return new SeriesDAO();
    }


}
