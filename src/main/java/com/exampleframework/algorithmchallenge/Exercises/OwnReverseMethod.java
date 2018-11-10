package com.exampleframework.algorithmchallenge.Exercises;

import java.util.ArrayList;
import java.util.List;

public class OwnReverseMethod {

    public static void ownReverseMethod(List<Integer> arr){
        List<Integer> copyOfList = new ArrayList<>(arr);

        for(int i=0; i<(copyOfList.size()/2); i++) {
            int temp = copyOfList.get(i);
            copyOfList.set(i, copyOfList.get(copyOfList.size() - i - 1));
            copyOfList.set((copyOfList.size() - i - 1), temp);
        }

    }
}
