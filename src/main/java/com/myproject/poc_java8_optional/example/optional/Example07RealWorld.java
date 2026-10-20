package com.myproject.poc_java8_optional.example.optional;

import java.util.Optional;

public class Example07RealWorld {

    public static void main(String[] args) {

        User user1 = new User("Icaro", "icaro@email.com");

        User user2 = new User("Maria", null);

        User user3 = null;

        User user4 = new User("Joao", "");

        User user5 = new User("Ana", "   ");

        System.out.println("User 1 email: " + getUserEmail(user1));
        System.out.println("User 2 email: " + getUserEmail(user2));
        System.out.println("User 3 email: " + getUserEmail(user3));
        System.out.println("User 4 email: " + getUserEmail(user4));
        System.out.println("User 5 email: " + getUserEmail(user5));
    }

    private static String getUserEmail(User user) {
        return Optional.ofNullable(user)
                .map(User::getEmail)
                .filter(email -> !email.trim().isEmpty())
                .orElse("Email not available");
    }

    static class User {

        private final String name;
        private final String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {

            return email;
        }

        /**
         * User 1 email: icaro@email.com
         * User 2 email: Email not available
         * User 3 email: Email not available
         * User 4 email: Email not available
         * User 5 email: Email not available
         */


    }
}
