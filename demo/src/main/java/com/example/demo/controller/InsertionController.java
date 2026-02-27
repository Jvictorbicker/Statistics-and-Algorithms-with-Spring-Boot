package com.example.demo.controller;

import com.example.demo.service.InsertionSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertionController {
    private final InsertionSort insertionSort;

    public InsertionController(InsertionSort insertionSort) {
        this.insertionSort = insertionSort;
    }

    @GetMapping("/sele")
    public int[] getSort() {
        return insertionSort.sort();
    }
}
