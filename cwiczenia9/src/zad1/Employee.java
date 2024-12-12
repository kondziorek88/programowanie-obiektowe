package zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.time.LocalDate.now;

public class Employee implements Comparable<Employee>{
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Adam", 2000.12,now()));
        employees.add(new Employee("Adam1", 200.12,now()));
        employees.add(new Employee("Adam2", 20.12,now()));
        employees.add(new Employee("Adam3", 21000.12,now()));
        employees.add(new Employee("Adam4", 200.12,now()));
        Collections.sort(employees);

    }

}


