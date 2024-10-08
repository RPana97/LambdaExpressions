package org.example;

public class SimpleLambda {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("10 + 5 = " + addition.operate(10, 5));

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("10 * 5 = " + multiplication.operate(10, 5));

        // Lambda expression for division
        MathOperation division = (a, b) -> a / b;
        System.out.println("10 / 5 = " + division.operate(10, 5));
    }

    // Functional interface with a single abstract method for performing operations on two integers
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }
}
