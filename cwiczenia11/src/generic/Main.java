package generic;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Fileo");
        String napis = "CZECHU";
        wypisz(animal);
        wypisz(napis);
    }
    public static <T> void wypisz(T object){
        System.out.println(object);
    }
    /*public static <T extends animal> void wypisz(T object){
        System.out.println(object);
    }*/
}
