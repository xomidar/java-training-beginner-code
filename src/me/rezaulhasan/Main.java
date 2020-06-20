package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*
        System.out.print("Your role: ");
        String role = scanner.next();


        switch (role) {
            case "admin":
                System.out.println("Your are admin");
                break;
            case "user":
                System.out.println("Your are user");
                break;
            default:
                System.out.println("Your are unknown");

        }
*/

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();


        var result = switch (temperature) {
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            case 12, 1, 2 -> "Winter";
            default -> "None";
        };

        System.out.println(result);

    }
}
