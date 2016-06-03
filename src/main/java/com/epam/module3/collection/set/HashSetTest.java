package com.epam.module3.collection.set;

import com.epam.module3.collection.runner.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private Set<Integer> hash = new HashSet<Integer>();

    public HashSetTest(int index) {
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
            hash.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to HashSet:        " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        for (Integer item : hash) {
            if (item.equals(index)) {
                search = item;
                break;
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from HashSet:     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        hash.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from HashSet:    " + estimatedTime + " ms");
    }
}
