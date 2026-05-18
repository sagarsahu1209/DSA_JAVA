package SwitchS;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String fruit =in.next();

        switch (fruit) {
            case "Apple" -> System.out.println("Apple");
            case "Orange" -> System.out.println("Orange");
            case "Mango" -> System.out.println("Mango");
            default -> System.out.println(" Invalid");
        }

    }
}

