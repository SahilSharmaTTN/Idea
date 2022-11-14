package com.sahil.SpringInitDemo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting through Quicksort");
        //Quicksort algo
    }
}
