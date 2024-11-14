package zad3;

import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        StringBuilder slowo = new StringBuilder("nowiutkies slowo");
        capitalizeEverySecond(slowo);
        System.out.println(slowo);

    }
    public static void capitalizeEverySecond(StringBuilder slowo){
        int dlugosc = slowo.length();
        for(int i =1;i<dlugosc;i+=2){
            char litera=slowo.charAt(i);
            litera = toUpperCase(litera);
            slowo.setCharAt(i,litera);
        }
    }
}
