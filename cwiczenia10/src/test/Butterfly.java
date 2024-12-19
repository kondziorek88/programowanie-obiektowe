package test;

import java.util.ArrayList;

public class Butterfly extends Animal{
    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        //ArrayList<LoudAnimal> animals = new ArrayList<>();
        animals.add(new Cat("Filemon"));
        animals.add(new Cat("Cezary"));
        animals.add(new Dog("Paweł"));
        animals.add(new Dog("Czarek"));
        animals.add(new Butterfly("Skibid"));
        for (Animal a: animals){
            if(a instanceof LoudAnimal){
                ((LoudAnimal) a).makeNoise();
                ((LoudAnimal) a).sayName();
            }
            ;

        }
    }


}
