package com.exampleframework.algorithmchallenge.Exercises;

import com.exampleframework.algorithmchallenge.Tooling.Output;
import com.exampleframework.algorithmchallenge.Tooling.Samples;
import com.exampleframework.algorithmchallenge.Tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class OwnShuffleMethodTest {

    @Test
    void ownShuffleListTest() {
        List<Duration> durs = Samples.createListWithRandomNumbers(5000, 5000, 100).stream()
                .map(list -> Timer.avgTimeInNanos(() -> OwnShuffleMethod.ownShuffle(list),100))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

        System.out.println("\n\n");
    }


    @Test
    void ownShuffleListTestWithData() {
        List<Integer> someList = Arrays.asList(1, 2, 3, 4);

        List<Integer> shuffeledList = OwnShuffleMethod.ownShuffle(someList);

        assertNotEquals(shuffeledList, someList);
        System.out.println(shuffeledList);

    }

}