package zad5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ocenki = new ArrayList<>();
        ocenki.add(1);
        ocenki.add(2);
        ocenki.add(3);
        ocenki.add(4);
        ocenki.add(5);
        ocenki.add(6);
        ocenki.add(1);
        Student student = new Student("Adam", "Mijas", ocenki);
        System.out.println(student.averageGrades());
    }
}
