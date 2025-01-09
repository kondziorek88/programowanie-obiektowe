package delegate;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        Muzeum muzeum = new Muzeum();
        Koncert koncert = new Koncert();

        KierownikWycieczki kierownikWycieczki = new KierownikWycieczki(muzeum);
        kierownikWycieczki.zalatwBilet();
        kierownikWycieczki.setBiletomat(koncert);
        kierownikWycieczki.zalatwBilet();
        Biletomat pielgrzymka = new Biletomat() {
            @Override
            public void wystawBilet() {
                System.out.println("Wystawiono bilet na pielgrzymke");

            }
        };
        kierownikWycieczki.setBiletomat(pielgrzymka);
        kierownikWycieczki.zalatwBilet();

    }
}
