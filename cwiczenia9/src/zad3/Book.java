package zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages, this.numberOfPages);
    }

    @Override
    public String toString() {
        return  title + ' ' + numberOfPages;

    }

    public static void main(String[] args) {
        /*ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Marny koniec", 190,LocalDate.now()));
        books.add(new Book("Zgroza w Dunwitch", 658,LocalDate.now()));
        books.add(new Book("Marny koniec 2", 200,LocalDate.now()));
        books.add(new Book("Skibidi", 19,LocalDate.now()));
        books.add(new Book("Za grzelkami", 1900,LocalDate.now()));
        System.out.println(books);
        Collections.sort(books);
        System.out.println(books);*/
        Book[] books1 = {new Book("Marny koniec", 190,LocalDate.now()),
                new Book("Zgroza w Dunwitch", 658,LocalDate.now()),
                new Book("Marny koniec 2", 200,LocalDate.now()),
                new Book("Skibidi", 19,LocalDate.now())};
        for(int i=0;i< books1.length;i++){
            System.out.println(books1[i]);
        }
        Arrays.sort(books1);
        for(int i=0;i< books1.length;i++){
            System.out.println(books1[i]);
        }

    }
}
