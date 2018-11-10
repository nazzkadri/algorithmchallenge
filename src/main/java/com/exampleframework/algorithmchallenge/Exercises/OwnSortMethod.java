package com.exampleframework.algorithmchallenge.Exercises;

import java.util.ArrayList;
import java.util.List;

public class OwnSortMethod {

    public static void sortAscOrder(List<Integer> arr) {
        ArrayList<Integer> duplicateValues = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            int j = i;
            for (j = j + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
    }

}