package zad4;

import java.util.Arrays;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setResults(int index, int result){
        this.results[index]=result;
    }
    public int avaregeResult(){
        int sum=0;
        for(int i=0;i<this.results.length;i++){
            sum+=this.results[i];
        }
        return sum/this.results.length;
    }

    @Override
    public String toString() {
        return "Results for " +
                firstName + ' ' +
                lastName + ':' +
                "Average Score = " + avaregeResult() +", Results:"
                +Arrays.toString(results);
    }
}
