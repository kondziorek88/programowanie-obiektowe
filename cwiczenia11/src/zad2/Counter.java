package zad2;

import java.util.ArrayList;

public class Counter <T>{
    private ArrayList<T> lista = new ArrayList<>();
    int count;
    public void add(T element){
        lista.add(element);
        this.count+=1;
    }
    public int getCount(){
        return count;
    }
}
