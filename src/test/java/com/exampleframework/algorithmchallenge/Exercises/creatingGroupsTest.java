package com.exampleframework.algorithmchallenge.Exercises;

import com.exampleframework.algorithmchallenge.Tooling.Output;
import com.exampleframework.algorithmchallenge.Tooling.Samples;
import com.exampleframework.algorithmchallenge.Tooling.Timer;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class creatingGroupsTest {
    @Test
    void createGroupsTest() {
        String[] cohorts = {"Nazz",
                "Freya",
                "Shweta",
                "Patrick",
                "Vu",
                "Chloe",
                "Amy",
                "Alex",
                "Din",
                "Damion",
                "Robbie",
                "Ruaridhi",
                "Victor",
                "Nathan",
                "Ibs",
                "Sebastian"
        };
        Duration durs = Timer.timeInNanos(() -> creatingGroups.getGroups(cohorts, 3));
        Output.printDurationsInNanosecs(Collections.singletonList(durs));
        System.out.println("\n\n");

    }
}