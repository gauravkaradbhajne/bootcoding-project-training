package util;

import java.util.Random;

public class AddressGenerator {
    private static String[] addresses = {"kr pandav colony,Nandanvan nagpur",
                                          "Trillilum VR, Medical Square",
                                          "Beside Haldiram,Ajni Square",
                                          "Bhole petrol pump,Civil lines"
    };
    public static String getAddress(){
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address = " + address);
        return address;
    }

    public static void main(String[] args) {
        AddressGenerator.getAddress();
    }
}
