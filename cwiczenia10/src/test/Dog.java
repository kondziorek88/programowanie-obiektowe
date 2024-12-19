package test;

public class Dog extends Animal implements LoudAnimal{
    public Dog(String name) {
        super(name);
    }


    @Override
    public void sayName() {
        System.out.println(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("WOOF");

    }
}
