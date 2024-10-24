package zad1;

import java.util.Objects;

public class Student {
    public static String nazwaSzkoly = "UWM";
    public String imie;
    public String nazwisko;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    /*@Override
    public String toString(){
        return ("Nazywam sie "
                + imie + " " + nazwisko
                +" uczę się na " + nazwaSzkoly+"\n");
    }*/
    @Override
    /*public boolean equals(Object other){
        if(other instanceof Student){
            return this.imie.equals(((Student) other).imie) &&
                    this.nazwisko.equals(((Student) other).nazwisko);
        }
        return false;
    }*/
    public boolean equals(Object other){
        if(other instanceof Student o){
            return this.imie.equals(o.imie) &&
                    this.nazwisko.equals(o.nazwisko);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public void przedstawSie(){
        System.out.printf("Nazywam sie "
                + imie + " " + nazwisko
        +" uczę się na " + nazwaSzkoly+"\n");
    }
}
