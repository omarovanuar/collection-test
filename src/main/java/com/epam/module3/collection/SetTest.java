package com.epam.module3.collection;

import java.util.Set;

import static com.epam.module3.collection.Runner.ELEMENTS_NUMBER;

public class SetTest extends CollectionTest {

    public long add(Object object) {
        Set<Integer> set = (Set<Integer>) object;
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_NUMBER; i++) {
            set.add(i);
        }
        return System.nanoTime() - startTime;
    }

    public long get(Object object, int index) {
        Set<Integer> set = (Set<Integer>) object;
        long startTime = System.nanoTime();
        for (Integer item : set) {
            if (item.equals(index)) {
                break;
            }
        }
        return System.nanoTime() - startTime;
    }

    public long remove(Object object, int index) {
        Set<Integer> set = (Set<Integer>) object;
        long startTime = System.nanoTime();
        set.remove(index);
        return System.nanoTime() - startTime;
    }
}
