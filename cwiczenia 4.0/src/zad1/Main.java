package zad1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Stefan", "Kowalski");
        Student student1 = new Student("Karolina", "Kozłowska");
        Student student2 = new Student("Karolina", "Kozłowska");
        /*System.out.println(Student.nazwaSzkoly);
        student1.przedstawSie();
        Student.nazwaSzkoly = "ART";
        student1.przedstawSie();*/
        //System.out.println(student);
        System.out.println(student.equals(student1));
        System.out.println(student2.equals(student1));
        System.out.println(student1.hashCode() + " " + student2.hashCode());
    }
}
