package delegate;

public class Koncert implements Biletomat{
    @Override
    public void wystawBilet(){
        System.out.println("Wystawiono bilet na kncert");
    }
}
