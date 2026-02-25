package com.example.demo.controller;

import com.example.demo.service.BubbleSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BubbleController {
    private final BubbleSort bubbleSort;

    public BubbleController(BubbleSort bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    @GetMapping("/sort")
    public int[] getSort() {
        return bubbleSort.sort();
    }
}
