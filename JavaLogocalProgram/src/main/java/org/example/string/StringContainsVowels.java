package org.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringContainsVowels {

    public static void main(String[] args) {
        String input1 = "India is also knows as Bharat";
        String input2 = "HK JMMNBDX";

        System.out.println(isStringContainsVowels(input1));
        System.out.println(isStringContainsVowels(input2));
        calculateStringChars(input1);
        calculateStringCharsWithStream(input1);
    }

    /**
     * To check vowels is containing or not
     */
    private static boolean isStringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }


    /**
     * To calculate count of each char from the input String using Hashmap
     *
     * @param input input String
     */
    private static void calculateStringChars(String input) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = input.toCharArray();

        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Using Hashmap");

//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }


    /**
     * To calculate count of each char from the input String using Stream
     *
     * @param input input String
     */
    private static void calculateStringCharsWithStream(String input) {

        Map<Character, Long> map = input.chars().mapToObj(c ->
                (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Using Stream");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
