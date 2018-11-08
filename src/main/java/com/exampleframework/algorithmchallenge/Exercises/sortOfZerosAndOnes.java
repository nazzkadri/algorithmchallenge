package com.exampleframework.algorithmchallenge.Exercises;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sortOfZerosAndOnes {

    public static List<Integer> sortZerosAndOnes(List<Integer> arrList){
        Stream <Integer> arrOfZeroes = sortOfZeros(arrList);
        Stream <Integer> arrofOnes = sortOnes(arrList);

            return Stream.concat(arrOfZeroes, arrofOnes)
                    .collect(Collectors.toList());
    }

    public static Stream<Integer> sortOfZeros(List<Integer> arrList){

         return arrList.stream()
                .filter(element -> element == 0);
    }

    public static Stream<Integer> sortOnes(List<Integer> arrList){

        return arrList.stream()
                .filter(element -> element == 1);

    }
}
