package com.exampleframework.algorithmchallenge.Exercises;

import com.exampleframework.algorithmchallenge.Tooling.Output;
import com.exampleframework.algorithmchallenge.Tooling.Samples;
import com.exampleframework.algorithmchallenge.Tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class OwnReverseMethodTest {

    @Test
    void accessLastTest() {
        List<Duration> durs = Samples.createListWithNInts(5000, 5000, 100).stream()
                .map(list -> Timer.timeInNanos(() -> OwnReverseMethod.ownReverseMethod(list)))
                .collect(Collectors.toList());
        Output.printDurationsInNanosecs(durs);

        System.out.println("\n\n");

    }

}