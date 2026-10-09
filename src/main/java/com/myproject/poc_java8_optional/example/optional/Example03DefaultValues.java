package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example03DefaultValues {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");
        Optional<String> emptyName = Optional.empty();

        String name1 = name.orElse("Unknown");
        String name2 = emptyName.orElse("Unknown");

        System.out.println("orElse with value: " + name1);
        System.out.println("orElse without value: " + name2);

        String name3 = name.orElseGet(
                () -> "Default User"
        );

        String name4 = emptyName.orElseGet(
                () -> "Default User"
        );

        System.out.println("orElseGet with value: " + name3);
        System.out.println("orElseGet without value: " + name4);

        String name5 = name.orElseThrow(
                () -> new IllegalArgumentException("Name not found")
        );

        System.out.println("orElseThrow with value: " + name5);

        try {
            emptyName.orElseThrow(
                    () -> new IllegalArgumentException("Name not found")
            );
        } catch (IllegalArgumentException exception) {
            System.out.println(
                    "Exception: " + exception.getMessage()
            );
        }

        /**
         * orElse with value: Icaro
         * orElse without value: Unknown
         * orElseGet with value: Icaro
         * orElseGet without value: Default User
         * orElseThrow with value: Icaro
         * Exception: Name not found
         */
    }
}