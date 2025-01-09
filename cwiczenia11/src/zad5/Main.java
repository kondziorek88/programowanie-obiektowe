package zad5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    public static <T> void swap(int index1, int index2, ArrayList<T> list){
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
