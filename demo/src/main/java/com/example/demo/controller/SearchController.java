package com.example.demo.controller;

import com.example.demo.model.Array;
import com.example.demo.service.BinarySearch;
import com.example.demo.service.InsertionSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
    private final BinarySearch binarySearch;

    public SearchController(BinarySearch binarySearch) {
        this.binarySearch = binarySearch;
    }

    @GetMapping
    public int search() {
        int value = 23;
        return binarySearch.search(value);
    }
}
