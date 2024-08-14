package org.example;

public class LambdaExpressionsFunctInt {
    public static void main(String[] args) {
        // Lambda expression for generating a greeting message
        Greeting greeting = name -> "Hello " + name + " !";
        System.out.println(greeting.generate("Bob"));

        // Lambda expression for converting Celsius to Fahrenheit
        TemperatureConverter celsiusToFahrenheit = celsius -> (celsius * 9 / 5) + 32;
        System.out.println("25 degrees celsius to Fahrenheit: " + celsiusToFahrenheit.convert(25));
    }

    // Functional interface for generating a greeting message
    @FunctionalInterface
    interface Greeting {
        String generate(String name);
    }

    // Functional interface for converting temperature values
    @FunctionalInterface
    interface TemperatureConverter {
        double convert(double value);
    }
}
