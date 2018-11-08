package com.exampleframework.algorithmchallenge.Exercises;

import java.util.List;

public class AccessLast {

    public static Integer RetrunLastElement(List<Integer> arr) {
        int last = arr.get(arr.size() - 1);
        return last;
    }

}
