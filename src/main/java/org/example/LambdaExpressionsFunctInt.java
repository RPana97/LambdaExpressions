package org.example;

public class LambdaExpressionsFunctInt {
    public static void main(String[] args) {
        Greeting greeting = name -> "Hello " + name + " !";
        System.out.println (greeting.generate ("Bob"));

        TemperatureConverter celsiusToFahrenheit = celsius -> (celsius * 9/5) + 32;
        System.out.println ("25 degrees celsius to Fahrenheit: " + celsiusToFahrenheit);
    }

    @FunctionalInterface
    interface Greeting {
        String generate (String name);
    }

    @FunctionalInterface
    interface TemperatureConverter {
        double convert (double value);
    }
}
