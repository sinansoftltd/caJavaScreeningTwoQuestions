package com.sinansoft.caJavaScreeningTwoQuestions;

import com.sinansoft.caJavaScreeningTwoQuestions.q1.SortedMap;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new SortedMap<>();
        sortedMap
                .add("3", "three")
                .add("1", "one")
                .add("2", "two");

        System.out.println(sortedMap.getKeys());
        for (String key : sortedMap) {
            System.out.println(sortedMap.get(key));
        }

        System.out.println(">>>>>>>");
        Iterator<String> reversedIterator = sortedMap.reversedIterator();
        while (reversedIterator.hasNext()) {
            System.out.println(reversedIterator.next());
        }


    }
}
