package zad2;

public class Television extends ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Włączono telewizor");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono telewizor");

    }
}
