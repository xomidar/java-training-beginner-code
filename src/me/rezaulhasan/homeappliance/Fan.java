package me.rezaulhasan.homeappliance;

/**
 * Date of creation 13-Jun-2020
 *
 * @author Md. Rezaul Hasan
 * @since 1.0
 */
public class Fan {

    private boolean isStarted = true;

    private int speed = 5;

    public void start(){
        System.out.println("Fan switched on.");
    }

    public void stop(){
        System.out.println("Fan switched off.");
    }

    public void accelerate(int speed){

        speed= speed;

        System.out.println("Fan accelerate to:" + speed);
    }

}
