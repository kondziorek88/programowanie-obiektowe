package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> lista = new ArrayList<>();
        lista.add(new Bitmap(20,40,"Mapa1"));
        lista.add(new Vector(30,60, "Vektor1"));
        lista.add(new Vector(40,60, "Vektor2"));
        lista.add(new Vector(20,1000, "Vektor3"));
        lista.add(new Bitmap(5,5,"Mapa2"));
        for(ComputerGraphic Cg: lista){
            Cg.loadFile();
        }
    }
}
