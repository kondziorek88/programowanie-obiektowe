package zad4;

public class Main {
    public static void main(String[] args) {
        Results student = new Results("Jan", "Kowalski",3);
        student.setResults(0,5);
        student.setResults(1,3);
        student.setResults(2,2);
        System.out.println(student.avaregeResult());
        System.out.println(student.toString());
    }
}
