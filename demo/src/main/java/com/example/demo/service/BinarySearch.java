package com.example.demo.service;

import com.example.demo.model.Array;
import org.springframework.stereotype.Service;

@Service
public class BinarySearch {

    private final Array array;
    private final InsertionSort insertionSort;

    public BinarySearch(Array array, InsertionSort insertionSort) {
        this.array = array;
        this.insertionSort = insertionSort;
    }

    public int search(int value) {
        insertionSort.sort();
        return searchRecursive(value, 0, array.arr.length - 1);
    }

    private int searchRecursive(int value, int start, int end) {
        if (start > end) return -1;

        int mid = (start + end) / 2;

        if (array.arr[mid] == value) return mid;
        if (value > array.arr[mid]) return searchRecursive(value, mid + 1, end);

        return searchRecursive(value, start, mid - 1);
    }
}
