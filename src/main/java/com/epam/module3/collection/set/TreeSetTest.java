package com.epam.module3.collection.set;

import com.epam.module3.collection.runner.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest implements Test {
    private long startTime;
    private long estimatedTime;
    private int index;
    private Integer search = 0;
    private Set<Integer> tree = new TreeSet<Integer>();

    public TreeSetTest(int index) {
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
            tree.add(i);
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("\nTime for adding to TreeSet:        " + estimatedTime + " ms");
    }

    private void getTest() {
        startTime = System.nanoTime();
        for (Integer item : tree) {
            if (item.equals(index)) {
                search = item;
                break;
            }
        }
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for getting from TreeSet:     " + estimatedTime + " ms for: " + search);
    }

    private void removeTest() {
        startTime = System.nanoTime();
        tree.remove(index);
        estimatedTime  = System.nanoTime() - startTime;
        System.out.println("Time for removing from TreeSet:    " + estimatedTime + " ms");
    }
}
