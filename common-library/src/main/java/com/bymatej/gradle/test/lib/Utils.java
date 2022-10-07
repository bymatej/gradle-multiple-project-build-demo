package com.bymatej.gradle.test.lib;

import java.util.Random;

/**
 * Worthless Utils
 */
public class Utils {

    private static final Random RANDOM = new Random();

    public static String getRandomFavoriteNumber(String name) {
        return String.format("Hi! My name is %s and my favorite number is %s", name, RANDOM.nextInt());
    }

}
