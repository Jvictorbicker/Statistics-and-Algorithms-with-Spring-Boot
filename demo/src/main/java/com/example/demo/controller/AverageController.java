package com.example.demo.controller;

import com.example.demo.service.Average;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AverageController {
    private final Average average;

    public AverageController(Average average) {
        this.average = average;
    }

    @GetMapping("/media")
    public double getAverage() {
        return average.arrAverage();
    }
}
