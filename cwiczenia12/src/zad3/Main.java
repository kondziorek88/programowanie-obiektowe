package zad3;

public class Main {
    public static void main(String[] args){
        String email1 = "Skibidi@wp.pl";
        String email2 = "Posadz";
        try{sprawdzFormatDanych(email2);}
        catch(NiepoprawnyFormatDanychException s){
            System.out.println(s.getMessage());
        }
        try{sprawdzFormatDanych(email1);}
        catch(NiepoprawnyFormatDanychException s){
            System.out.println(s.getMessage());
        }

    }
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(!dane.contains("@")){
            throw new NiepoprawnyFormatDanychException("Adres email nie zawiera @");
        }
    }
}
