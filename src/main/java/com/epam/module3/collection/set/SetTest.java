package com.epam.module3.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;

    public SetTest(int index) {
        this.index = index;
        Set<Integer> hash = new HashSet<Integer>();
        addTest(hash);
        getTest(hash);
        removeTest(hash);
        Set<Integer> tree = new TreeSet<Integer>();
        addTest(tree);
        getTest(tree);
        removeTest(tree);
    }

    private void addTest(Set<Integer> set) {
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            set.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to " + set.getClass().getName() + ":        " + estimatedTime + " ms");
    }

    private void getTest(Set<Integer> set) {
        startTime = System.nanoTime();
        for (Integer item : set) {
            if (item.equals(index)) {
                search = item;
                break;
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from " + set.getClass().getName() + ":     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest(Set<Integer> set) {
        startTime = System.nanoTime();
        set.remove(index);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for removing from " + set.getClass().getName() + ":    " + estimatedTime + " ms");
    }
}
