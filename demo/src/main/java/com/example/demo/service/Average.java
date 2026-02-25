package com.example.demo.service;

import com.example.demo.model.Array;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Average {
    Array array = new Array();

    public double arrAverage() {
        double sum = 0;

        for (int i = 0; i < array.arr.length; i++) {
            sum += array.arr[i];
        }
        return sum / array.arr.length;
    }
}
