package com.maozi.utils;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * 概率随机执行函数
 * @param <T>
 */
public class WeightedRandomSelector<T> {

    //ConcurrentSkipListMap保证线程安全
    private final NavigableMap<Double, T> map = new TreeMap<>();

    private final Random random;

    private double total = 0;

    public WeightedRandomSelector() {
        this(new Random());
    }

    public WeightedRandomSelector(Random random) {
        this.random = random;
    }

    public void add(double weight, T result) {
        if (weight <= 0) {
            return;
        }
        total += weight;
        map.put(total, result);
    }

    public T next() {
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }

}