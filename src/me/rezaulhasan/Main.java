package me.rezaulhasan;

import me.rezaulhasan.homeappliance.Fan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is today's temperature: ");
        int temperature = scanner.nextInt();

        boolean isWarm = temperature > 30;
        boolean isCold = temperature < 20;

        Fan fan = new Fan();

        if (isWarm) {

            System.out.println("It's very hot!");

            fan.start();

            System.out.print("How much you want to accelerate your fan: ");
            int speed = scanner.nextInt();

            fan.accelerate(speed);


        } else if (isCold) {

            System.out.println("It's very cold!");

            fan.stop();

        } else {

            System.out.println("It's good day.");

        }

    }
}
