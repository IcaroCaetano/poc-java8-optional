package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example01CreatingOptional {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");

        Optional<String> nullableName = Optional.ofNullable(null);

        Optional<String> emptyName = Optional.empty();

        System.out.println(name);
        System.out.println(nullableName);
        System.out.println(emptyName);

        /**
         * Optional[Icaro]
         * Optional.empty
         * Optional.empty
         */
    }
}