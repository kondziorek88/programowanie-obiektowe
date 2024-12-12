package zad4;

import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return  id +" "+
                 name;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(2,"Mąka", 12.12));
        products.add(new Product(3,"Pilot", 2.12));
        products.add(new Product(5,"Laptop", 1112.12));
        products.add(new Product(1,"Toaleta", 121.12));
        products.add(new Product(12,"Deska", 10.00));
        System.out.println(products);
        products.sort(new priceComperator());
        System.out.println(products);
    }
    static class priceComperator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            if(Double.compare(o1.price, o2.price)==0){
                return Integer.compare(o1.id, o2.id);
            }
            return Double.compare(o1.price, o2.price);
        }
    }
}
