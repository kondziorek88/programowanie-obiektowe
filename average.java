import java.util.ArrayList;

public class average {
    public static double averageValue(ArrayList<Double> lista){
        int ilosc = lista.size();
        if(ilosc==0){
            return 0;
        }
        double suma = 0;
        for(int i=0; i<lista.size(); i++){
            suma+=lista.get(i);
            }
        return (suma/ilosc);
    }
}
