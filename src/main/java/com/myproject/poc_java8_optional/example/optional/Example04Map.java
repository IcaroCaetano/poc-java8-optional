package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example04Map {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");

        Optional<String> upperCaseName = name.map(String::toUpperCase);

        System.out.println("Original name: " + name);
        System.out.println("Uppercase name: " + upperCaseName);

        Optional<Integer> nameLength = name.map(value -> value.length());

        System.out.println("Name length: " + nameLength);

        Optional<String> emptyName = Optional.empty();

        Optional<String> transformedName = emptyName.map(String::toUpperCase);

        System.out.println("Transformed empty name: " + transformedName);

        String result = emptyName
                .map(String::toUpperCase)
                .orElse("Unknown");

        System.out.println("Default result: " + result);

        String chainedResult = name
                .map(String::trim)
                .map(String::toUpperCase)
                .orElse("Unknown");

        System.out.println("Chained result: " + chainedResult);

        /**
         * Original name: Optional[Icaro]
         * Uppercase name: Optional[ICARO]
         * Name length: Optional[5]
         * Transformed empty name: Optional.empty
         * Default result: Unknown
         * Chained result: ICARO
         */
    }
}