package com.exampleframework.algorithmchallenge.Exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OwnMergeSortTest {

    @Test
    void mergeSortTest() {
        int[] arr = {12,55,8,3,37,24,13};
        int[] left = {8,12,24,37};
        int[] right = {3,13,55};
//        int[] resultArray= OwnMergeSort.mergeSortedArrays(arr,left,right);

        int[] resultArray= OwnMergeSort.mergeSort(arr);
                System.out.println(Arrays.toString(resultArray));

    }

}