package me.rezaulhasan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = "";

/*
        while (!name.equalsIgnoreCase("exit")) {

            name = scanner.next();
            System.out.println("Hello " + name);

        }
*/

        do{
            name = scanner.next();
            System.out.println("Hello " + name);

        }while(!name.equalsIgnoreCase("exit"));

    }
}
