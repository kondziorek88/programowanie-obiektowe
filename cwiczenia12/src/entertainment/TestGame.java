package entertainment;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> lista = new ArrayList<Game>();
        lista.add(new AdventureGame());
        lista.add(new StrategyGame());
        for(Game g: lista){
            System.out.println(g.getRating());
        }
    }
}
