package com.epam.module3.collection.list;

import com.epam.module3.collection.runner.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private List<Integer> linked = new LinkedList<Integer>();


    public LinkedListTest(int index) {
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
            linked.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to LinkedList:     " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        search = linked.get(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from LinkedList:  " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        linked.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from LinkedList: " + estimatedTime + " ms");
    }
}
