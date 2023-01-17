package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TwoColumns {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/home/leo/test"));
        sc.useDelimiter(",");
        ArrayList<TwoInts> converted = new ArrayList<>();

        while (sc.hasNext()) {
            String[] both_columns = sc.next().split(",");
            converted.add(new TwoInts(Integer.valueOf(both_columns[0]), Integer.valueOf(both_columns[1])));
        }
        converted.sort((o1, o2) -> o1.compareTo(o2));
        for (TwoInts current: converted){
            System.out.println(current.toString());
        }
    }
}
