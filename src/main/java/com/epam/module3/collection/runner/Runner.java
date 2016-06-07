package com.epam.module3.collection.runner;

import com.epam.module3.collection.list.ListTest;
import com.epam.module3.collection.map.MapTest;
import com.epam.module3.collection.set.SetTest;

import java.util.Random;

public class Runner {
    private static Random random = new Random();

    public static void main(String[] args) {
        int index = random.nextInt(50000);

        new ListTest(index);
        new SetTest(index);
        new MapTest(index);
    }
}
