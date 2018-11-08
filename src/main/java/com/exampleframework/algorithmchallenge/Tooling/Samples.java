package com.exampleframework.algorithmchallenge.Tooling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {

    public static List<Integer> sizes = Arrays.asList(10000, 20000, 30000, 40000);

//    public static List<List<Integer>> sampleLists() {
//        return sizes.stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//    }

//    public static List<List<Integer>> randomLists() {
//        return sizes.stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .peek(list -> Collections.shuffle(list))
//                .collect(Collectors.toList());
//    }

    //    big numbers
//    public static List<Integer> bigSize = Arrays.asList(1000000);
//
//    public static List<List<Integer>> bigSampleList() {
//        return bigSize.stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//    }

//    public static List<List<Integer>> bigRandomList() {
//        List<List<Integer>> bigList = bigSize.stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//
//        return bigList.stream()
//                .map(list -> ShuffleList.shuffleBuiltIn(list))
//                .collect(Collectors.toList());
//    }


public static void hundredIterations(int steps){
    for(int i=1; i<=100; i++) {
        createListWithSteps(steps);
        steps += 5000;
    }

}

    public static ArrayList<Integer> createListWithSteps(int steps) {

            int arraySize = steps;

            return (ArrayList<Integer>) ListCreation.createArrayList(1, arraySize);

    }


    public static List<List<Integer>> sampleListsManualValues() {
        return createListWithNInts(5000, 5000, 100)
                .stream()
                .map(count -> ListCreation.createListWithStream(1, count))
                .collect(Collectors.toList());
    }

    public static List<Integer> createListWithNInts(int start, int stepSize, int limit) {

        return IntStream.iterate(start, prev -> prev + stepSize)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }


//    public static List<List<Integer>> sampleListsManualValues() {
//        return createListWith100Ints(1000, 1000)
//                .stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//    }

}
