import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //lista tablicowa
        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
        listaLiczbCalkowitych.add(3);
        listaLiczbCalkowitych.add(4);
        listaLiczbCalkowitych.add(5);
        listaLiczbCalkowitych.add(6);
        listaLiczbCalkowitych.add(7);
        listaLiczbCalkowitych.add(8);
        listaLiczbCalkowitych.add(9);
        listaLiczbCalkowitych.add(10);
        listaLiczbCalkowitych.add(11);
        listaLiczbCalkowitych.add(12);
        /*

        for (Integer liczbCalkowitych : listaLiczbCalkowitych) {
            System.out.println(liczbCalkowitych);
        }
        for (int i=listaLiczbCalkowitych.size()-1; i>=0; i--) {
            System.out.println(listaLiczbCalkowitych.get(i));
        }
        System.out.println(listaLiczbCalkowitych.reversed());
        */
        ListyTablicoweCwiczenia l1 = new ListyTablicoweCwiczenia();

       // System.out.println(l1.minimumValue(listaLiczbCalkowitych));
        //System.out.println(ListyTablicoweCwiczenia.minimumValue(listaLiczbCalkowitych));
        ArrayList<Double> listaLiczbCalkowitych1 = new ArrayList<>();
        listaLiczbCalkowitych1.add(3.0);
        listaLiczbCalkowitych1.add(4.2);
        listaLiczbCalkowitych1.add(5.1);
        listaLiczbCalkowitych1.add(6.5);
        listaLiczbCalkowitych1.add(7.7);
        listaLiczbCalkowitych1.add(8.12);
        listaLiczbCalkowitych1.add(9.13);
        listaLiczbCalkowitych1.add(10.4);
        listaLiczbCalkowitych1.add(11.9);
        listaLiczbCalkowitych1.add(12.8);
        System.out.println(average.averageValue(listaLiczbCalkowitych1));
    }


}