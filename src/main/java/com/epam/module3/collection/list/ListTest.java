package com.epam.module3.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private long startTime;
    private long estimatedTime;
    private int index;


    public ListTest(int index) {
        this.index = index;
        List<Integer> array = new ArrayList<Integer>();
        addTest(array);
        getTest(array);
        removeTest(array);
        List<Integer> linked = new LinkedList<Integer>();
        addTest(linked);
        getTest(linked);
        removeTest(linked);
    }

    private void addTest(List<Integer> list) {
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to " + list.getClass().getName() + ":      " + estimatedTime + " ms");
    }

    private void getTest(List<Integer> list) {
        startTime = System.nanoTime();
        Integer search = list.get(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from " + list.getClass().getName() + ":   " + estimatedTime + " ms for: " + search);
    }

    private void removeTest(List<Integer> list) {
        startTime = System.nanoTime();
        list.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from " + list.getClass().getName() + ":  " + estimatedTime + " ms");
    }
}
