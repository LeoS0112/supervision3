package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(sqrt(2));
    }

    public static double sqrt(double num) throws Exception{
        if (num < 0){
            throw new Exception("negative");
        }
        else {
            double current = num;
            for (int i = 0; i < 100; i++){
                current = current - (current*current - num) / (2 * current);
            }
            return current;
        }

    }
}