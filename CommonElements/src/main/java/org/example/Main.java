package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел первой коллекции");
        byte size1 = in.nextByte();
        System.out.println("Введите числа первой коллекции");
        Set<Integer> set1 = new HashSet<>(size1 + 1);
        for (byte i = 0; i < size1; i++) {
            set1.add(in.nextInt());
        }
        System.out.println("Введите колличество чисел второй коллекции");
        byte size2 = in.nextByte();
        System.out.println("Введите числа Второй коллекции");
        Set<Integer> set2 = new HashSet<>(size2 + 1);
        for (byte i = 0; i < size2; i++) {
            set2.add(in.nextInt());
        }
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : set1) {
            if (set2.contains(i)) ts.add(i);
        }
        System.out.println(ts);

    }
}