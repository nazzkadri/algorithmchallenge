package com.exampleframework.algorithmchallenge.Tooling;

import java.time.Duration;
import java.util.List;

public class Output {

    public static void printDurationsInNanosecs(List<Duration> durs) {
        durs.stream()
                .map(duration -> duration.toNanos())
                .forEach(nanoSeconds -> System.out.println(nanoSeconds));
    }

    public static void printDurationInNanosecs(Duration dur) {
        System.out.println(dur.toNanos());
    }
}
