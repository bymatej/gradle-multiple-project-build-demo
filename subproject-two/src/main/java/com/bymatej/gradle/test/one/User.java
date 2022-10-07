package com.bymatej.gradle.test.one;

import com.bymatej.gradle.test.lib.Utils;

public class User {

    public static void main(String... args) {
        String randomStuff = Utils.getRandomFavoriteNumber("Robo");

        if (randomStuff == null || randomStuff.length() <= 0) {
            System.out.println("Not a valid string");
        } else {
            System.out.println(randomStuff);
        }
    }

}
