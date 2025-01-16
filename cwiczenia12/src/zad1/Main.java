package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static <T extends Comparable<T>> T sortAndreturnFirst(T[] lista) throws EmptyArrayException {
        if(lista == null||lista.length == 0){
            throw new EmptyArrayException("Tablica nie moze byc pusta");
        }
        Arrays.sort(lista);
        return lista[0];
    }

    public static void main(String[] args) {
        Book book1 = new Book("b", "Stryj");
        Book book2 = new Book("a", "Stryj");
        Book book3 = new Book("c", "Stryj");
        Book[] books = {book1, book2, book3};
        try{
            System.out.println(Main.sortAndreturnFirst(books));

        } catch(EmptyArrayException a){
            System.out.println(a.getMessage());
        }
    }
}
