package org.example.string;

import java.util.stream.Collectors;

public class SeparateAlfaNumaricFromString {


    public static void main(String[] args) {
        String input = "wet89893fdh";

        // Separate letters
        String letters = input.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        // Separate digits
        String digits = input.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
