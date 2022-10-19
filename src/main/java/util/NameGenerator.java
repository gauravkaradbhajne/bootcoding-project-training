package util;

import java.util.Random;

public class NameGenerator {
    private static String[] names= {"ramesh",
            "suresh", "gaurav","odi",
    };
    public static String getNames(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Names = " + name);
        return name;
    }

    public static void main(String[] args) {
        NameGenerator.getNames();
    }
}

