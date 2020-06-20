package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();

        String message = temperature > 30 ? "It's hot!" : "It's cold!";

        System.out.println(message);
    }
}
