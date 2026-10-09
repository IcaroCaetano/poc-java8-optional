package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example02CheckingValues {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");

        Optional<String> emptyName = Optional.empty();

        System.out.println("Name is present: " + name.isPresent());

        System.out.println("Empty name is present: " + emptyName.isPresent());

        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        }

        if (emptyName.isPresent()) {
            System.out.println("Name: " + emptyName.get());
        } else {
            System.out.println("No name available");
        }

        /**
         * Name is present: true
         * Empty name is present: false
         * Name: Icaro
         * No name available
         */
    }
}