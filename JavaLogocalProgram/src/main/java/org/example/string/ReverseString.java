package org.example.string;

public class ReverseString {

    public static void main(String[] args) throws IllegalAccessException {
        String input = "Java Logical Program";
        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) throws IllegalAccessException {
        if (input == null)
            throw new IllegalAccessException("invalid input");

        char[] chars = input.toCharArray();

        StringBuilder output = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            output.append(chars[i]);
        }

        return output.toString();
    }
}
