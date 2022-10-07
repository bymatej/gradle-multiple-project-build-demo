package com.bymatej.gradle.test.one;

import org.apache.commons.lang3.StringUtils;

import com.bymatej.gradle.test.lib.Utils;

public class User {

    public static void main(String... args) {
        String randomStuff = Utils.getRandomFavoriteNumber("Bobo");

        if (StringUtils.isBlank(randomStuff)) {
            System.out.println("Not a valid string");
        } else {
            System.out.println(randomStuff);
        }
    }

}
