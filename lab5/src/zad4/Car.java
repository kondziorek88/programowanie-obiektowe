package zad4;

public class Car extends Vehicle{
    public String nazwa;
    /*@Override
    public void drive(){
        System.out.println("The car is moving.");
    }*/
    @Override
    public void drive(){
        super.drive();
        System.out.println(this.nazwa);
    }
}
