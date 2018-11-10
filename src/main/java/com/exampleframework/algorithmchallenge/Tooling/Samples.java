package com.exampleframework.algorithmchallenge.Tooling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {


    public static List<List<Integer>> createListWithNInts(int start, int stepSize, int iterations) {

                List<Integer> temp = IntStream.iterate(start, prev -> prev + stepSize)
                .limit(iterations)
                .boxed()
                .collect(Collectors.toList());

                return temp.stream()
                        .map(count -> ListCreation.createListWithStream(1, count))
                        .collect(Collectors.toList());

    }


    public static List<List<Integer>> createListWithZeroAndOnes(int start, int stepSize, int iterations) {

        List<Integer> temp = IntStream.iterate(start, prev -> prev + stepSize)
                .limit(iterations)
                .boxed()
                .collect(Collectors.toList());

        return temp.stream()
                .map(count -> ListCreation.createListWithZerosAndOnes(0, count))
                .collect(Collectors.toList());

    }


    public static List<List<Integer>> createListWithRandomNumbers(int start, int stepSize, int iterations) {

        List<Integer> temp = IntStream.iterate(start, prev -> prev + stepSize)
                .limit(iterations)
                .boxed()
                .collect(Collectors.toList());

        return temp.stream()
                .map(count -> ListCreation.createRandomLists(0, count))
                .collect(Collectors.toList());

    }




//    public static List<List<Integer>> sampleListsManualValues() {
//        return createListWith100Ints(1000, 1000)
//                .stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//    }

}
