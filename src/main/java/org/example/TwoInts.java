package org.example;

import java.util.Comparator;

public class TwoInts implements Comparable<TwoInts> {

    private int int_one;
    private int int_two;

    public TwoInts(int a, int b){
        this.int_one = a;
        this.int_two = b;
    }
    @Override
    public int compareTo(TwoInts ti) {
        if (this.int_one > ti.int_one){
            return 1;
        } else if (this.int_one < ti.int_one) {
            return -1;
        } else if (this.int_two > ti.int_two) {
            return 1;
        } else if (this.int_two < ti.int_two) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return String.valueOf(this.int_one) + " " + String.valueOf(this.int_two);
    }

}
