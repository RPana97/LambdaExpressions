package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctions {
    public static void main(String[] args) {

        // Predicate to check if a number is positive
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println("Is 10 positive? " + isPositive.test(10));
        System.out.println("Is -10 positive? " + isPositive.test(-10));

        // Function to square a number
        Function<Integer, Integer> square = number -> number * number;
        System.out.println("Square of 10 is: " + square.apply(10));

        // Consumer to print a message
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Howdy");

        // Supplier to provide a default message
        Supplier<String> messageSupplier = () -> "Default Howdy";
        System.out.println(messageSupplier.get());
    }
}
