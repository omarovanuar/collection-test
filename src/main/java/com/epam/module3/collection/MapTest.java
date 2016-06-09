package com.epam.module3.collection;

import java.util.Map;

import static com.epam.module3.collection.Runner.ELEMENTS_NUMBER;

public class MapTest extends CollectionTest {

    public long add(Object object) {
        Map<Integer, Integer> map = (Map<Integer, Integer>) object;
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_NUMBER; i++) {
            map.put(i, i);
        }
        return System.nanoTime() - startTime;
    }

    public long get(Object object, int index) {
        Map<Integer, Integer> map = (Map<Integer, Integer>) object;
        long startTime = System.nanoTime();
        for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(index)) {
                break;
            }
        }
        return System.nanoTime() - startTime;
    }

    public long remove(Object object, int index) {
        Map<Integer, Integer> map = (Map<Integer, Integer>) object;
        long startTime = System.nanoTime();
        map.remove(index);
        return System.nanoTime() - startTime;
    }
}
