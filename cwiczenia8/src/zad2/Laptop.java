package zad2;

public class Laptop extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Włączono laptopa");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono laptopa");

    }
}
