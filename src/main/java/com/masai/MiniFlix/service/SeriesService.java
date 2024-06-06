package com.masai.MiniFlix.service;

import com.masai.MiniFlix.dao.SeriesDAO;
import com.masai.MiniFlix.entity.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SeriesService {
    @Autowired
    private SeriesDAO seriesDAO;

    public List<Series> getAllSeries() {
        return seriesDAO.findAll();
    }

    public void addSeries(Series series) {
        seriesDAO.save(series);
    }

    public void updateSeries(int id, Series series) {
        seriesDAO.update(id, series);
    }

    public Series getSeriesById(int id) {
        return seriesDAO.findById(id);
    }

    public void deleteSeries(int id) {
        seriesDAO.delete(id);
    }
}
