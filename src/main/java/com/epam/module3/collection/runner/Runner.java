package com.epam.module3.collection.runner;

import com.epam.module3.collection.list.ArrayListTest;
import com.epam.module3.collection.list.LinkedListTest;
import com.epam.module3.collection.map.HashMapTest;
import com.epam.module3.collection.map.TreeMapTest;
import com.epam.module3.collection.set.HashSetTest;
import com.epam.module3.collection.set.TreeSetTest;

import java.util.Random;

public class Runner {
    private static Random random = new Random();

    public static void main(String[] args) {
        int index = random.nextInt(50000);

        Test arrayListTest = new ArrayListTest(index);
        arrayListTest.test();
        Test linkedListTest = new LinkedListTest(index);
        linkedListTest.test();

        Test hashSetTest = new HashSetTest(index);
        hashSetTest.test();
        Test treeSetTest = new TreeSetTest(index);
        treeSetTest.test();

        Test hashMapTest = new HashMapTest(index);
        hashMapTest.test();
        Test treeMapTest = new TreeMapTest(index);
        treeMapTest.test();
    }
}
