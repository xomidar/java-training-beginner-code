package me.rezaulhasan.homeappliance;

/**
 * Date of creation 20-Jun-2020
 *
 * @author Md. Rezaul Hasan
 * @since 1.0
 */
public class Fan {

    public void start() {
        System.out.println("Fan switched on.");
    }

    public void stop() {
        System.out.println("Fan switched off.");
    }

    public void accelerate(int speed) {

        System.out.println("Fan accelerate to:" + speed);
    }

}
