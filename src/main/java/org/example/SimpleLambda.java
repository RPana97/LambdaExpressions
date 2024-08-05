package org.example;

public class SimpleLambda {
    public static void main(String[] args) {
        MathOperation addition = (a,b) -> a + b;
        System.out.println ("10 + 5 = " +addition.operate(10,5));

        MathOperation subtraction = (a,b) -> a - b;
        System.out.println ("10 - 5 = " +subtraction.operate(10,5));

        MathOperation multiplication = (a,b) -> a * b;
        System.out.println ("10 * 5 = " +multiplication.operate(10,5));

        MathOperation division = (a,b) -> a / b;
        System.out.println ("10 / 5 = " +division.operate(10,5));
    }

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);

    }
}
