package org.example.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndCommonElementFrom2List {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(
                Arrays.asList("Hi","hello","Java"));

        List<String> list2 = new ArrayList<>(
                Arrays.asList("Hi","Java","aws","gcp"));

        list1.retainAll(list2);

        System.out.println("Common element from both list: " + list1);
    }
}
