package entertainment;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> lista = new ArrayList<>();
        lista.add(new AdventureGame());
        lista.add(new StrategyGame());
        lista.add(new AdventureGame());
        lista.add(new StrategyGame());
        lista.add(new AdventureGame());
        for(Game gm: lista){
            System.out.println(gm.getRating());
        }
    }
}
