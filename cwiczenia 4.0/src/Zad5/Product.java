package Zad5;

public class Product {
    public static int numberOfProducts;
    public static final int  MAX_PRODUCTS = 150;

    public Product() {
        if(this.numberOfProducts<MAX_PRODUCTS){
            numberOfProducts++;
        }
    }
}
