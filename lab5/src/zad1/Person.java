package zad1;

public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setfirstName(Person p, String firstName){
        p.firstName=firstName;
    }
    public void setlastName(Person p, String lastName){
        p.lastName=lastName;
    }
    public void przedstawSie(){
        System.out.println("Nazywam się " + getFirstName() + " " + this.lastName );
    }
}
