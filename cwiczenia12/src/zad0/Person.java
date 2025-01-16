package zad0;

public record Person(String imie, int wiek) {
    public Person {
        if(wiek<0){
            throw new IllegalArgumentException("Wiek nie może być mniejszy od zera");

        }

    }
}
