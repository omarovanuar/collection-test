package com.epam.module3.collection.list;

import com.epam.module3.collection.runner.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private List<Integer> array = new ArrayList<Integer>();


    public ArrayListTest(int index) {
        this.index = index;
    }

    public void test() {
        addTest();
        getTest();
        removeTest();
    }

    private void addTest() {
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            array.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for adding to ArrayList:      " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        search = array.get(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from ArrayList:   " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        array.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from ArrayList:  " + estimatedTime + " ms");
    }

}
