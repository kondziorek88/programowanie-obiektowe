package zad6;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Comparable<T>> T minValue(T[] list) {
        if (list.length > 0) {
            T min = list[0];
            for (int i = 0; i < list.length; i++) {
                if (min.compareTo(list[i]) > 0) {
                    min = list[i];
                }
            }
            return min;
        }
        return null;
    }
}
/*class Comperator <T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return ;
    }
}*/
