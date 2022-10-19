package com.utils;

import java.util.Random;

public class OTPGenrator {
    final static int MAX = 999999;
    final static int MIN = 100000;

    static Random random = new Random();


    public static int getOTP(){

        int number = random.nextInt(MAX-MIN);
        int otp = MIN + number;

        System.out.println("OTP Number = " + otp);
        return otp;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            OTPGenrator.getOTP();
        }

    }
}
