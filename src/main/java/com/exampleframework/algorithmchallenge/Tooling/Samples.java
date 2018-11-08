package com.exampleframework.algorithmchallenge.Tooling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {

//    public static List<Integer> sizes = Arrays.asList(10, 100, 1000, 10000);
//
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




//    public static List<List<Integer>> sampleListsManualValues() {
//        return createListWithNInts(5000, 5000, 100)
//                .stream()
//                .map(count -> ListCreation.createListWithStream(1, count))
//                .collect(Collectors.toList());
//    }

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
