package com.epam.module3.collection.map;

import com.epam.module3.collection.runner.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private Map<Integer, Integer> tree = new TreeMap<Integer, Integer>();

    public TreeMapTest(int index) {
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
            tree.put(i, i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to TreeMap:        " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
            if (entry.getKey().equals(index)) {
                search = entry.getValue();
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from TreeMap:     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        tree.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from TreeMap:    " + estimatedTime + " ms");
    }
}
