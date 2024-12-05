package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> lista = new ArrayList<>();
        lista.add(new Laptop());
        lista.add(new Smartphone());
        lista.add(new Laptop());
        lista.add(new Smartphone());
        lista.add(new Television());
        for(ElectronicDevice Ed : lista){
            Ed.turnOn();
            Ed.turnOff();
        }
    }
}
