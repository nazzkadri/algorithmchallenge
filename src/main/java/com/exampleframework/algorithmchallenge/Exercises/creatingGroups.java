package com.exampleframework.algorithmchallenge.Exercises;



import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
import java.util.stream.Stream;


public class creatingGroups {

    public static void getGroups(String[] cohorts, int gn) {
        List<String> list = new ArrayList<String>(Arrays.asList(cohorts));
        Collections.shuffle(list);
        list.toArray(cohorts);
        //System.out.println(list);
        System.out.println(Arrays.toString(cohorts));

        int size = cohorts.length;

        int groupsize = (size / gn);
      //  System.out.println("groupsie" + groupsize);

        int remainder = size % gn;
      //  System.out.println("remainder" + remainder);

        int groups[] = new int[gn];

        for (int j = 0; j < gn; j++) {
            groups[j] = groupsize;

        }

        if (remainder > 1) {
            for (int i = 0; i < remainder; i++) {
                groups[i] += 1;
            }

        } else {
            groups[groups.length - 1] += 1;
        }


        int randomStartPoint = 8;

        String[] firstArray = Arrays.copyOfRange(cohorts, randomStartPoint, cohorts.length);
       // System.out.println(Arrays.toString(firstArray));

        String[] secondArray = Arrays.copyOfRange(cohorts, 0, randomStartPoint);
       // System.out.println(Arrays.toString(secondArray));


        String[] result = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
       // System.out.println(Arrays.toString(result));

        List<List<String>> finalGroups = createGroups(gn);

        int i = 0;
        int z = 0;

        while (z < gn) {
            System.out.println("z" + z);

            for (int j = 0; j < groups[z]; j++) {
                finalGroups.get(z).add(result[i]);
                i++;
            }

            z++;
        }
        // }


        System.out.println(finalGroups);


    }
    public static List<List<String>> createGroups (Integer numberOfGroups){
        List<List<String>> groups = new ArrayList<List<String>>();
        for (int i = 0; i < numberOfGroups; i++) {
            groups.add(new ArrayList<>());
        }
        return groups;
    }



}