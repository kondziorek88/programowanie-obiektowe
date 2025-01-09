package zad4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Integer[] lista = {1,2,3,4,5};

    printArray(lista);
    }
    public static <T> void printArray(T list[]){
        int i=0;
        while(i< list.length) {
            System.out.println(list[i]);
            i++;
        }
    }
}
