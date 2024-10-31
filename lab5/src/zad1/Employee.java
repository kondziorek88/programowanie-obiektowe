package zad1;

public class Employee extends Person{

    public int lataPracy;
    public Employee(String fistName, String lastName, int lataPracy){
        super(fistName, lastName);
        this.lataPracy = lataPracy;
    }

    @Override
    public void przedstawSie(){
        //System.out.println("Nazywam się " + getFirstName() + " " + this.lastName );
        super.przedstawSie();
        System.out.println("Pracuje "+ lataPracy + " lat");
    }
}
