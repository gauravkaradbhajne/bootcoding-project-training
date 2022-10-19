package com.utils;

import java.util.Random;

public class PasswordGenerator {
    public static  String getPassword(){

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabets = alphabets.toLowerCase();
        String digits = "0123456789";
        String alphanumeric = alphabets + lowerAlphabets + digits;

        System.out.println(alphanumeric);

        Random random = new Random();
        String password = " ";
        for (int i=0; i<8;i++) {
            int randomIndex = random.nextInt(alphanumeric.length());
            char character = alphanumeric.charAt(randomIndex);
            password = password + character;
            System.out.println("Random Index: " + randomIndex + " random Character: " + character);
        }
        System.out.println("System Genrator password is : " + password );

        return password;
    }

    public static void main(String[] args) {
      PasswordGenerator.getPassword();
    }
}
