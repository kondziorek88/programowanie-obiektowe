package zad2;

public class Smartphone extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Włączono telefon");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono telefon");

    }
}
