import java.util.ArrayList;

public class zera {
    public static int countZeroes(ArrayList<Integer> lista){
        int number=0;
        for(int i=0; i <lista.size(); i++){
            if(lista.get(i)==0){
                number++;
            }
        }
        return number;
    }


}
