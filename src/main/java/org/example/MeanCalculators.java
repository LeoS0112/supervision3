package org.example;

import java.util.List;

public class MeanCalculators {
    public static double meanForEachLoop(List<Integer> lst){
        int count=0;
        int total=0;
        for (Integer ele: lst){
            count++;
            total+=ele;
        }
        return (double) total / (double) count;
    }

    public static double meanForLoop(List<Integer> lst){
        int count=0;
        int total=0;
        for (int i =0; i < lst.size(); i++){
            count++;
            total+=lst.get(i);
        }
        return (double) total / (double) count;
    }

    public static double meanIterator(List<Integer> lst){
        int count=0;
        int total=0;
        while (lst.iterator().hasNext()){
            count++;
            total+=lst.iterator().next();
            lst.remove(0);
        };
        return (double) total / (double) count;
    }
}
