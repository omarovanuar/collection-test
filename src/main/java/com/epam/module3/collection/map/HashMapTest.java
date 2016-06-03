package com.epam.module3.collection.map;

import com.epam.module3.collection.runner.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private Map<Integer, Integer> hash = new HashMap<Integer, Integer>();

    public HashMapTest(int index) {
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
            hash.put(i, i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to TreeSet:        " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getKey().equals(index)) {
                search = entry.getValue();
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from HashMap:     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        hash.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from HashMap:    " + estimatedTime + " ms");
    }
}
