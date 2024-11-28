package zad5;

import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Integer> listaOcen) {
    public float averageGrades(){
        int suma=0;
        for(int i=0;i<listaOcen.size();i++){
            suma+= (float) listaOcen().get(i);
        }
        return (float) (suma/(float)listaOcen.size());
    }
}
