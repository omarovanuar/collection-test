package com.epam.module3.collection;

import static com.epam.module3.collection.Runner.index;

public class CollectionComparator {
    public void compare(CollectionTest testType, Object a, Object b) {
        System.out.println("Add function test:");
        System.out.println(a.getClass().getSimpleName() + this.getCompareSign(testType.add(a), testType.add(b)) +
                b.getClass().getSimpleName());
        System.out.println("Get function test:");
        System.out.println(a.getClass().getSimpleName() + this.getCompareSign(testType.get(a, index), testType.get(b, index)) +
                b.getClass().getSimpleName());
        System.out.println("Remove function test:");
        System.out.println(a.getClass().getSimpleName() + this.getCompareSign(testType.remove(a, index), testType.remove(b, index)) +
                b.getClass().getSimpleName());
    }

    private char getCompareSign(long time1, long time2) {
        if (time1 > time2) return '<';
        else if (time1 < time2) return '>';
        else return '=';
    }
}
