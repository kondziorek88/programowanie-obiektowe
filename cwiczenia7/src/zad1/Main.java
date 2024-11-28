package zad1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dob dob", 12);
        //System.out.println(p1);
        Person p2 = new Person("Dob dob", 12);
        Person p3 = new Person("Dob dob", -1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.skibidi());
        //p1.imie = "Camera man";
        p1.przedstawSie();
        p3.przedstawSie();

    }
}
