package przykład1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String imie;
    double średniaOcen;
    int rokUrodzenia;

    public Student(String imie, double średniaOcen, int rokUrodzenia) {
        this.imie = imie;
        this.średniaOcen = średniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }



    public double getŚredniaOcen() {
        return średniaOcen;
    }



    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

   /* @Override
    public int compareTo(Student o) {
        //0 równy, dodatnia większy, o większe liczba ujemna
        if(this.średniaOcen>o.średniaOcen){
            return 1;
        } else if (this.średniaOcen<o.średniaOcen) {
            return -1;
        }
        return 0;
            */
        //}

    @Override
    public String toString() {
        return średniaOcen +" " + rokUrodzenia;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam", 4.0, 1998));
        students.add(new Student("Adam", 3.0, 1999));
        students.add(new Student("Adam", 4.0, 1999));
        System.out.println(students);
        Collections.sort(students, new AvgGradeStudentComparator());
        System.out.println(students);
        students.sort(new YearOfBirthStudentComparator());
        System.out.println(students);

        Student s1 = new Student("A", 3.5, 2004);
        //Student s2 = s1;
        //s2.rokUrodzenia=2006;
        //System.out.println(s1.rokUrodzenia);
        Student s2 = null;
        try{
            s2 = (Student) s1.clone();
        }catch  (CloneNotSupportedException e) {
            System.out.println("Nie udało się sklonować studenta");
        }
        s2.rokUrodzenia=2006;
        System.out.println(s1.getRokUrodzenia());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Student o){
        //return Double.compare(this.średniaOcen, o.średniaOcen);
        if(Double.compare(this.średniaOcen, o.średniaOcen)==0){
            return Integer.compare(o.rokUrodzenia, this.rokUrodzenia);
        }
        else{
            return Double.compare(this.rokUrodzenia, o.rokUrodzenia);
        }
    }
}

class AvgGradeStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.średniaOcen, o2.średniaOcen);
    }
}
class YearOfBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.rokUrodzenia, o1.rokUrodzenia);
    }
}