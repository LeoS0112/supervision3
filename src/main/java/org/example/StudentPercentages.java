package org.example;

import java.util.*;

public class StudentPercentages {

    private HashMap<Object, Object> map;

    public StudentPercentages() {
        this.map = new HashMap<>();
    }

    public void addStudent(Student S){
        this.map.put(S.name, S.percent);
    }

    public ArrayList findGoodStudents(int P){
        ArrayList<String> goodStudents = new ArrayList<>();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            if (P < (int) entry.getValue()){
                goodStudents.add((String) entry.getKey());
            }
        }
        Collections.sort(goodStudents, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        return goodStudents;
    }
}
