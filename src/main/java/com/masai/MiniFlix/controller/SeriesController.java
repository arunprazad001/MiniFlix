package com.masai.MiniFlix.controller;

import com.masai.MiniFlix.entity.Series;
import com.masai.MiniFlix.service.SeriesService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService seriesService;

    @GetMapping("/getAll")
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }

    @PostMapping("/add")
    public void addSeries(@RequestBody Series series) {
        seriesService.addSeries(series);
    }

    @PutMapping("update/{id}")
    public void updateSeries(@PathVariable int id, @RequestBody Series series) {
        seriesService.updateSeries(id, series);
    }

    @GetMapping("get/{id}")
    public Series getSeriesById(@PathVariable int id) {
        return seriesService.getSeriesById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteSeries(@PathVariable int id) {
        seriesService.deleteSeries(id);
    }
}
