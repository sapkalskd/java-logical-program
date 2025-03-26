package org.example.array;

public class SecondHighestNoFromUnsortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 4, 5, 8, 23, 45, 12, 387};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }

        System.out.println("Highest : " + highest + "\n Second Highest : " + secondHighest);
    }
}
