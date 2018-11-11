package com.exampleframework.algorithmchallenge.Exercises;

import java.util.List;

public class OwnMergeSort {

    public static int[] mergeSort(int[] originalArr){

       // int [] originalArr = originalArray.stream().mapToInt(Integer::intValue).toArray();
        int n = originalArr.length;
        if(n < 2) {
            return originalArr;
        }
        int midPoint = originalArr.length / 2;

        int[] leftArr = new int[0+midPoint];
        int[] rightArr = new int[originalArr.length - midPoint];
        for(int i=0; i<=midPoint - 1; i++){
            leftArr[i] = originalArr[i];
        }
        int k=0;
        for(int j=midPoint; j<=originalArr.length - 1;j++){
            rightArr[k] = originalArr[j];
            k++;
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        mergeSortedArrays(originalArr, leftArr, rightArr);
        return originalArr;

    }

    public static int[] mergeSortedArrays(int[] arrOriginal, int[] leftArr, int[] rightArr){
        int i=0;
        int j=0;
        int k=0;
        while(i < leftArr.length && j < rightArr.length){

                if(leftArr[i] < rightArr[j]){
                    arrOriginal[k] = leftArr[i];
                    k++;
                    i++;
                }
                else{
                    arrOriginal[k] = rightArr[j];
                    k++;
                    j++;
                }

        }
        while(i < leftArr.length){
            arrOriginal[k] = leftArr[i];
            k++;
            i++;
        }
        while(j < rightArr.length){
            arrOriginal[k] = rightArr[j];
            k++;
            j++;
        }

    return arrOriginal;
    }


}
