package com.exampleframework.algorithmchallenge.Tooling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListCreation {


    public static List<Integer> createListWithStream(int from, int limit) {
        return IntStream.range(from, limit)
                .boxed()
                .collect(Collectors.toList());

    }

    public static List<Integer> createListWithZerosAndOnes(int from, int limit) {

        Random random = new Random();

        int start = 0, end = 1;

// generate an infinite stream of random integers between 0 and 1
        return random.ints(limit, from, end+1)
                .boxed()
                .collect(Collectors.toList());
    }


    public static List<Integer> createRandomLists(int from, int limit){

//        Random random = new Random();
//
//        return IntStream.generate(() -> random.nextInt(limit))
//                .limit(limit)
//                .boxed()
//                .collect(Collectors.toList());

        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(limit))
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());

    }

}
