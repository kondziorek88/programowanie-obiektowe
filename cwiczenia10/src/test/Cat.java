package test;

public class Cat extends Animal implements LoudAnimal{
    public Cat(String name){
        super(name);
    }


    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void sayName() {
        System.out.println(name);
    }
}
