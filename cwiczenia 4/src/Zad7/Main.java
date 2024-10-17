package Zad7;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(16,12);
        Time time2 = new Time(4,25);
        System.out.println("po pierwszej zmianie:");
        Time.addTime(time1, time2);
        System.out.println(time1.hours);
        System.out.println(time1.minutes);
        System.out.println("Po drugiej zmianie:");
        Time.addTime(time1, time2);
        System.out.println(time1.hours);
        System.out.println(time1.minutes);
    }
}
