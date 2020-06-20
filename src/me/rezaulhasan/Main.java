package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();

        boolean isWarm = temperature > 30;
        boolean isCold = temperature < 20;


        if (isWarm) {

            System.out.println("It's very hot!");

        } else if (isCold) {

            System.out.println("It's very cold!");

        } else {

            System.out.println("It's good day.");

        }

        switch (true) {
            case isWarm:
                System.out.println("Your are admin");
                break;
            case isCold:
                System.out.println("Your are user");
                break;
            default:
                System.out.println("Your are unknown");
        }

    }
}
