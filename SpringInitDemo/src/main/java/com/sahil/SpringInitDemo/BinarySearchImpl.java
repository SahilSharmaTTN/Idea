package com.sahil.SpringInitDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
            @Qualifier("bubble")
    SortingAlgorithm sortingAlgorithm;

    boolean binarySearch( int arr[] , int numberToSearch){

        sortingAlgorithm.sort(arr);
        //search code
        System.out.println("Searching for :" + numberToSearch);

        return true;
    }
}
