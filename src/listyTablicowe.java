public class listyTablicowe {
    public static String odwrocNapis(String napis){
        StringBuilder odwrocony = new StringBuilder(napis);
        /*for(int i = napis.length()-1; i>=0; i--){
            odwrocony += napis.charAt(i);
        }*/
        return odwrocony.reverse().toString();
    }
    public static boolean charAt(String napis){
        StringBuilder poczikon = new StringBuilder(napis);
        return(poczikon.charAt(0)==poczikon.charAt(poczikon.length()-1));
    }
    public static String zamiana(String napis){

        StringBuilder zmieniany = new StringBuilder(napis);
        char temp = zmieniany.charAt(0);
        zmieniany.setCharAt(0,(zmieniany.charAt(zmieniany.length()-1)));
        zmieniany.setCharAt(zmieniany.length()-1, temp);
        return zmieniany.toString();
    }
}
