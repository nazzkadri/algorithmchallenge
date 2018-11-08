package com.exampleframework.algorithmchallenge.Exercises;

import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static List<Integer> reverseList(List<Integer> arrList){

        // reverse the list
         Collections.reverse(arrList);
        // convert to array again
        return arrList;
    }
}
