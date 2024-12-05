package store;

import java.util.ArrayList;

public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> lista1 = new ArrayList<>();
        lista1.add(new Book());
        lista1.add(new Book());
        lista1.add(new Book());
        lista1.add(new Clothing());
        lista1.add(new Clothing());
        for(Product pd: lista1){
            System.out.println(pd.getPrice());
        }
    }


}
