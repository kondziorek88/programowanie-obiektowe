package zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        Laptop laptop = new Laptop("MSI", "Dragon", data);
        Laptop laptop1 = null;
        try{
            laptop1 = (Laptop) laptop.clone();
        }
        catch(CloneNotSupportedException c){
            System.out.println(c.getMessage());
        }
        finally {
            laptop1.purchaseDate = LocalDate.MAX;
        }
        System.out.println(laptop1.purchaseDate);
        System.out.println(laptop.purchaseDate);

    }
}
