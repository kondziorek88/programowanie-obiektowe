package zad3;



public class Main {
    public static void main(String[] args) {


    Address address = new Address("Smocza", 15, 14200, "Iława");
    Person person = new Person("Adam", "kowalski", address);
    System.out.println(person);
    }
}
