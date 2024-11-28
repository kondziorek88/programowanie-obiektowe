package zad1;

public record Person(String skibidi, int sigma) {
    public Person{
        if(sigma < 0){
            sigma = 0;
        }
    }
    public Person(){
        this("Default", 0);
    }
    public void przedstawSie(){
        System.out.println("Nazywam się " + skibidi + " i mam " + sigma + " sigiemek");
    }
}
