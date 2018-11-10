package com.exampleframework.algorithmchallenge.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OwnShuffleMethod {

    public static ArrayList<Integer> ownShuffle(List<Integer> array){
        Random rand = new Random();
        List<Integer> resultArray = new ArrayList<Integer>();
        List<Integer> copyOfList = new ArrayList<>(array);

        while(copyOfList.size()>0 ){
            int index = rand.nextInt(copyOfList.size());
            resultArray.add(copyOfList.get(index));
            int last = copyOfList.get(copyOfList.size() - 1);
            copyOfList.set(index, last);
            copyOfList.remove(copyOfList.size() - 1);
        }
        //for (Integer n : resultArray ){
       return (ArrayList<Integer>) resultArray;
        //}
    }

}


