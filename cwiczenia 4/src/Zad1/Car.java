package Zad1;

public class Car {

    public static int speed;
    public String brand;
    public String model;
    public static void accelerate(int value){
        Car.speed+=value;
    }
    public static void decelarate(int value){
        Car.speed-=value;
    }

}
