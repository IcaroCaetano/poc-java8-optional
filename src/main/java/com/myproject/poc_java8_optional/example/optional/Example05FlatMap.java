package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example05FlatMap {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Icaro");

        Optional<Optional<String>> mapResult = name.map(Example05FlatMap::findNickname);

        System.out.println("map() result: " + mapResult);

        Optional<String> flatMapResult = name.flatMap(Example05FlatMap::findNickname);

        System.out.println("flatMap() result: " + flatMapResult);

        Optional<String> missingNickname = Optional.of("Maria").flatMap(Example05FlatMap::findNickname);

        System.out.println("Missing nickname: " + missingNickname);

        String result = name
                .flatMap(Example05FlatMap::findNickname)
                .map(String::toUpperCase)
                .orElse("NICKNAME NOT FOUND");

        System.out.println("Final result: " + result);

        String emptyResult = Optional.<String>empty()
                .flatMap(Example05FlatMap::findNickname)
                .orElse("NAME NOT PROVIDED");

        System.out.println("Empty result: " + emptyResult);
    }

    private static Optional<String> findNickname(String name) {

        if ("Icaro".equals(name)) {
            return Optional.of("Ica");
        }

        return Optional.empty();
    }

    /**
     * map() result: Optional[Optional[Ica]]
     * flatMap() result: Optional[Ica]
     * Missing nickname: Optional.empty
     * Final result: ICA
     * Empty result: NAME NOT PROVIDED
     */
}