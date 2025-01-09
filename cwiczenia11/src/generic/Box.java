package generic;

public class Box <T, U>{
    T value1;
    U value2;

    public Box(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(T value1){
        this.value1 = value1;
    }
    public T getValue1(){
        return value1;
    }
    public void setValue2(U value2) {
        this.value2 = value2;
    }
    public U getValue2(){
        return value2;
    }

    public static void main(String[] args) {
        /*Animal animal = new Animal("Filemon");
        Box<Animal> box1 = new Box<>(animal);
        box1.get().dajGlos();
        Animal animal2 = new Animal("Bonifacy");
        box1.set(animal2);
        box1.get().dajGlos();
        System.out.println(box1.get().name);
        String napis = "Ćześć!";
        Box<String> box3NaNapis = new Box<>(napis);
        System.out.println(box3NaNapis.get());*/
    }
}
