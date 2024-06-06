package com.masai.MiniFlix.dao;

import com.masai.MiniFlix.entity.Series;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class SeriesDAO {
    private List<Series> series = new ArrayList<>();

    public List<Series> findAll() {
        return series;
    }

    public void save(Series series) {
        this.series.add(series);
    }

    public void update(int id, Series updatedSeries) {
        this.series.set(id, updatedSeries);
    }

    public Series findById(int id) {
        return series.get(id);
    }

    public void delete(int id) {
        this.series.remove(id);
    }
}
