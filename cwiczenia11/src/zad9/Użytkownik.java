package zad9;

public class Użytkownik {
    private Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }
    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyślij(informacja);
    }
}
