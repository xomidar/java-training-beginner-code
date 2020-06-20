package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();

        boolean isWarm = temperature > 30;

        if (isWarm) {

            System.out.println("It's hot!");

        } else {

            System.out.println("It's cold!");

        }
    }
}
