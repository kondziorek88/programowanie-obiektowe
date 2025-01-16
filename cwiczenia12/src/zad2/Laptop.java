package zad2;


import java.time.LocalDate;

public class Laptop implements Cloneable{
    String brand;
    String model;
    LocalDate purchaseDate;

    public Laptop(String brand, String model, LocalDate purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
}
