package zad8;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Nie odpala, sadeg.");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Na pewno? nie odpali potem.");;
    }
}
