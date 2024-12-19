package test;

public interface LoudAnimal {
    void makeNoise();
    default void sayName(){
        System.out.println("i don't know my name");
    }

}
