package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your role: ");
        String role = scanner.next();


/*
        if (role.equalsIgnoreCase("admin")) {

            System.out.println("Your are " + role);

        } else if (role.equalsIgnoreCase("user")) {

            System.out.println("Your are " + role);

        } else {

            System.out.println("Your are unknown");

        }
*/

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

    }
}
