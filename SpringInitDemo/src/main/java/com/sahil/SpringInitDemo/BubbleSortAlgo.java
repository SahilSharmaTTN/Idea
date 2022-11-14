package com.sahil.SpringInitDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Sort using Bubble sort");
        //sorting using bubble sort
    }
}
