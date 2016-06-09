package com.epam.module3.collection;

import java.util.List;

import static com.epam.module3.collection.Runner.ELEMENTS_NUMBER;

public class ListTest extends CollectionTest{
    public long add(Object object) {
        List<Integer> list = (List<Integer>) object;
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_NUMBER; i++) {
            list.add(i);
        }
        return System.nanoTime() - startTime;
    }

    public long get(Object object, int index) {
        List<Integer> list = (List<Integer>) object;
        long startTime = System.nanoTime();
        list.get(index);
        return System.nanoTime() - startTime;
    }

    public long remove(Object object, int index) {
        List<Integer> list = (List<Integer>) object;
        long startTime = System.nanoTime();
        list.remove(index);
        return System.nanoTime() - startTime;
    }
}
