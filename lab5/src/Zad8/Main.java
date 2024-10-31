package Zad8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> ceny = new ArrayList<Double>();
        ceny.add(15.0);
        ceny.add(300.0);
        ceny.add(1000.0);
        Computer computer = new Computer("Intel", "F15", ceny);
        Laptop laptop = new Laptop("acer", "G32", ceny, 2300);
        Desktop desktop = new Desktop("MSI", "Dragon3", ceny, "Z szkłem");
        System.out.println(computer.toString());
        System.out.println(laptop.toString());
        System.out.println(desktop.toString());
    }
}
