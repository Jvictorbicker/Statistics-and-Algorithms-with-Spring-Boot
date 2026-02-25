package com.example.demo.service;

import com.example.demo.model.Array;
import org.springframework.stereotype.Service;

@Service
public class BubbleSort {
    public Array array = new Array();

    public int[] sort() {
        for (int i = 0; i  < array.arr.length; i++) {
            for (int j = 0; j < array.arr.length - i - 1; j++) {
                if (array.arr[j] > array.arr[j+1]) {
                    int aux = array.arr[j];
                    array.arr[j] = array.arr[j+1];
                    array.arr[j+1] = aux;
                }
            }
        }
        return array.arr;
    }
}
