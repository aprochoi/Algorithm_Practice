package javatest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("book", "apple", "fineapple", "grape", "car", "bobo", "bbibbi", "crong");

        strings.sort(Comparator.comparingInt(String::length));

        System.out.println(strings);
    }
}
