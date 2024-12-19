package zad6;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static double dzielenie(){
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        try{int liczba1 = liczba.nextInt();
        }catch(InputMismatchException e ){
            System.out.println("Podaj liczbę całkowitą");
            liczba.close();
            dzielenie();
        }
        liczba.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę");
        try{int liczba2 = scanner.nextInt();
        }catch(InputMismatchException e ){
            System.out.println("Podaj liczbę całkowitą");
            scanner.close();
            dzielenie();
        }
        int liczba2 = scanner.nextInt();
        scanner.close();
        try{
            double i = liczba1 / liczba2;
        }
        catch(ArithmeticException e) {
            System.out.println("nie można dzielić przez zero");
            dzielenie();

        }

        double i = (double) liczba1 / (double) liczba2;
        return i;
    }

    public static void main(String[] args) {
            dzielenie();
        }

}
