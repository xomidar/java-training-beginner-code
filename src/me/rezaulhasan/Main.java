package me.rezaulhasan;

public class Main {

    public static void main(String[] args) {


        final int workHour = 8;
        final int lunchHour = 1;

        int officeHour = workHour + lunchHour;

        System.out.println(officeHour);


        int weekDays = 5 ;

        int remainingWeekDays = weekDays--;

        System.out.println(weekDays);
        System.out.println(remainingWeekDays);

    }
}
