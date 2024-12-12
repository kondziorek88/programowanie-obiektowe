package zad5;

import java.time.LocalDate;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthday;

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
}
class Comperaor implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if(o1.lastName.compareTo(o2.lastName)==0){
            return o1.firstName.compareTo(o2.firstName);
        }
        else{
            return o1.lastName.compareTo(o2.lastName);
        }
    }
}
