package org.example;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 30;
        int b = 90;

        System.out.println("Before swap a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap a = " + a + " b = " + b);
    }
}
