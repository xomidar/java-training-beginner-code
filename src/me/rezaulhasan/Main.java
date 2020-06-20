package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your role: ");
        String role = scanner.next();


        if (role == "admin") {

            System.out.println("Your are " + role);

        } else if (role == "user") {

            System.out.println("Your are " + role);

        } else {

            System.out.println("Your are unknown");

        }

    }
}
