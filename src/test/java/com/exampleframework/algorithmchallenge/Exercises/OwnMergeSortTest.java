package com.exampleframework.algorithmchallenge.Exercises;

import com.exampleframework.algorithmchallenge.Tooling.Output;
import com.exampleframework.algorithmchallenge.Tooling.Samples;
import com.exampleframework.algorithmchallenge.Tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.*;

class OwnMergeSortTest {

    @Test
    void mergeSortTest() {
        int[] arr = {12,55,8,3,37,24,13};

        Duration  durs = Timer.timeInNanos(() -> OwnMergeSort.mergeSort(arr));
        Output.printDurationsInNanosecs(Collections.singletonList(durs));

        System.out.println("\n\n");


//        List<Duration> durs = Samples.createListWithNInts(10, 10, 10).stream()
//                .map(list -> Timer.timeInNanos(() -> OwnMergeSort.mergeSort(list)))
//                .collect(Collectors.toList());
//        Output.printDurationsInNanosecs(durs);
//
//        System.out.println("\n\n");


//        int[] resultArray= OwnMergeSort.mergeSort(arr);
//                System.out.println(Arrays.toString(resultArray));

    }

}