package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example06Filter {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");

        Optional<String> filteredName = name.filter(value -> value.startsWith("I"));

        System.out.println("Matching name: " + filteredName);

        Optional<String> anotherName = name.filter(value -> value.startsWith("A"));

        System.out.println("Non-matching name: " + anotherName);

        Optional<String> emptyName = Optional.empty();

        Optional<String> filteredEmpty = emptyName.filter(value -> value.startsWith("I"));

        System.out.println("Empty Optional: " + filteredEmpty);

        String result = name
                .filter(value -> value.length() > 10)
                .orElse("Name is too short");

        System.out.println("Validation result: " + result);

        Optional<Integer> age = Optional.of(25);

        Optional<Integer> adultAge =
                age.filter(value -> value >= 18);

        System.out.println("Adult age: " + adultAge);
    }
}
