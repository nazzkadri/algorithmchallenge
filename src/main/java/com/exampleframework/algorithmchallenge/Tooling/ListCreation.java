package com.exampleframework.algorithmchallenge.Tooling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListCreation {



//    public static List<Integer> createArrayList(int from, int limit){
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(limit);
//        for (int i=from; i < limit; i++) {
//            arrayList.add(i);
//        }
//        return arrayList;
//    }

    public static List<Integer> createListWithStream(int from, int limit) {
        return IntStream.range(from, limit)
                .boxed()
                .collect(Collectors.toList());
    }

}
