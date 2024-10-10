import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(listyTablicowe.odwrocNapis("czesc"));
        System.out.println(listyTablicowe.charAt("czesc"));
        System.out.println(listyTablicowe.zamiana("Witaj"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst do odwrócenia:");
        String wejscie = scanner.nextLine();
        System.out.println("Podaj liczbe");
        int wejscieLiczba = scanner.nextInt();
        System.out.println(listyTablicowe.odwrocNapis(wejscie));
        listyTablicowe.choinka(3);
    }
}