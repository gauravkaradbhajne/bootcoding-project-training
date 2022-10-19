package com.utils;

import java.util.Random;

public class EmaiIdGenrator {
    private static final String EMAIL_SUFFIX = "@gmail.com";
    private static  final Random random = new Random();
    private static final int MIN = 2000;
    private static final int MAX = 2022;

    public static String getEmailId(String name){

        int randomNumber = random.nextInt(MAX - MIN);
        int year = MIN +randomNumber;
        String emailId = name + year + EMAIL_SUFFIX;
        System.out.println("Email Id : " + emailId);
        return emailId;
    }

    public static void main(String[] args) {
        EmaiIdGenrator.getEmailId("Gaurav");
    }
}
