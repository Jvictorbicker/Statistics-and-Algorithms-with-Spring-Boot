package com.example.demo.service;

import com.example.demo.model.Array;
import org.springframework.stereotype.Service;

@Service
public class InsertionSort {

    private final Array array;

    public InsertionSort(Array array) {
        this.array = array;
    }

    public int[] sort() {
        for (int i = 1; i < array.arr.length; i++) {
            int sorted = array.arr[i];
            int j = i - 1;

            while (j >= 0 && array.arr[j] > sorted) {
                array.arr[j + 1] = array.arr[j];
                j--;
            }

            array.arr[j + 1] = sorted;
        }
        return array.arr;
    }
}
