package com.exampleframework.algorithmchallenge.Exercises;

import com.exampleframework.algorithmchallenge.Tooling.Output;
import com.exampleframework.algorithmchallenge.Tooling.Samples;
import com.exampleframework.algorithmchallenge.Tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleListTest {

    @Test
    void shuffleListTest() {
        List<Duration> durs = Samples.createListWithRandomNumbers(5000, 5000, 100).stream()
                .map(list -> Timer.avgTimeInNanos(() -> ShuffleList.shuffleList(list),100))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

        System.out.println("\n\n");
    }

}