package com.epam.module3.collection;

import java.util.*;

public class Runner {
    private static Random random = new Random();
    public static final int ELEMENTS_NUMBER = 50000;
    public static int index = random.nextInt(ELEMENTS_NUMBER);

    public static void main(String[] args) {
        CollectionTest listTest = new ListTest();
        CollectionTest setTest = new SetTest();
        CollectionTest mapTest = new MapTest();
        List<Integer> array = new ArrayList<Integer>();
        List<Integer> linked = new LinkedList<Integer>();
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        CollectionComparator comparator = new CollectionComparator();

        System.out.println("Lists compare results:");
        comparator.compare(listTest, array, linked);

        System.out.println("\nSets compare results:");
        comparator.compare(setTest, hashSet, treeSet);

        System.out.println("\nMaps compare results:");
        comparator.compare(mapTest, hashMap, treeMap);
    }
}
