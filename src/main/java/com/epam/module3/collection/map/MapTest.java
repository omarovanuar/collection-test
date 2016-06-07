package com.epam.module3.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;

    public MapTest(int index) {
        this.index = index;
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        addTest(hash);
        getTest(hash);
        removeTest(hash);
        Map<Integer, Integer> tree = new TreeMap<Integer, Integer>();
        addTest(tree);
        getTest(tree);
        removeTest(tree);
    }

    private void addTest(Map<Integer, Integer> map) {
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            map.put(i, i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to " + map.getClass().getName() + ":        " + estimatedTime + " ms");
    }

    private void getTest(Map<Integer, Integer> map) {
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(index)) {
                search = entry.getValue();
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from " + map.getClass().getName() + ":     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest(Map<Integer, Integer> map) {
        startTime = System.nanoTime();
        map.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from " + map.getClass().getName() + ":    " + estimatedTime + " ms");
    }
}
