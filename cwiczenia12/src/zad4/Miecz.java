package zad4;

public class Miecz{
    Bron bron;
    public Miecz(Bron bron) {
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.uzyjBroni();
    }


    @Override
    public void uzyjBroni() {
        System.out.println("Użyto miecza");
    }
}
