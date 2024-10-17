package Zad1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.imie = "Stefan";
        student.nazwisko = "Kowalski";
        student.specjalnosc = "ISI";
        Car car =  new Car();
        car.brand = "Mazda";
        car.model = "Miata";
        car.speed = 15;
        System.out.println(car.speed);
        Car.accelerate(10);
        System.out.println(car.speed);
        Car.decelarate(15);
        System.out.println(car.speed);

    }

}
