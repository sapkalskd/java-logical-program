package org.example.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1,12,1,34,34,45,55,55,6));

        System.out.println("List with duplicate: " + list);

        removeDuplicateFromList(list);
    }

    private static void removeDuplicateFromList(List<Integer> list) {

        List<Integer> newList = new ArrayList<>();

        for (Integer i : list){

            if (!newList.contains(i)){
                newList.add(i);
            }
        }

        System.out.println("List without deplicate: " + newList);
    }

}
