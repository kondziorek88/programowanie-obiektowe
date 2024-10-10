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
    public static void choinka(int n){
        for(int i=0; i<n; i++){
            for(int j=n-1;j>(0);j--){
                System.out.print("\u0000");
            }
            for(int k=0;k<(2*i); k++){
                System.out.print("*");
            }
            System.out.printf("*\n");
        }
    }
}
