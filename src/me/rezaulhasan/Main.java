package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();

        boolean isWarm = temperature > 30;
        boolean isCold = temperature < 20;
//        boolean isNormal = temperature > 20 && temperature <= 30;


/*
        if (isWarm) {

            System.out.println("It's very hot!");

        } else if (isCold) {

            System.out.println("It's very cold!");

        } else if (isNormal) {

            System.out.println("It's good day.");

        }
*/

        if (isWarm) {

            System.out.println("It's very hot!");

        } else if (isCold) {

            System.out.println("It's very cold!");

        } else {

            System.out.println("It's good day.");

        }

    }
}
