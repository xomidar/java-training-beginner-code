package me.rezaulhasan;

public class Main {

    public static void main(String[] args) {

        int temperature = 21;

        boolean isWarm = temperature > 30;

        System.out.println(isWarm);

        boolean isNormal = temperature > 20 && temperature <= 30;

        System.out.println(isNormal);

        boolean isCold = temperature < 20;

        System.out.println(isCold);

    }
}
