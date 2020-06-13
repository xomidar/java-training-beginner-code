package me.rezaulhasan;

public class Main {

    public static void main(String[] args) {

        int temperature = 21;

        boolean isWarm = temperature > 30;
        boolean isNormal = temperature > 20 && temperature <= 30;
        boolean isCold = temperature < 20;

        if(isWarm){

            System.out.println("It's very hot!");

        } else if (isNormal){

            System.out.println("It's good day.");

        } else if(isCold){

            System.out.println("It's very cold!");
        }

    }
}
