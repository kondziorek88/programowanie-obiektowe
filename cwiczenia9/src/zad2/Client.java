package zad2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import static java.time.LocalTime.now;

public class Client implements Comparable<Client>{
    String name;
    int clientNumber;
    Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    @Override
    public int compareTo(Client o) {
        return o.lastLogin.compareTo(this.lastLogin);
    }

    @Override
    public String toString() {
        return
                name + " " + lastLogin ;
    }

    public static void main(String[] args) {
        ArrayList<Client> clients= new ArrayList<>();
        clients.add(new Client("Adam", 17, new Date(2004, Calendar.NOVEMBER,31)));
        clients.add(new Client("Adam2", 1, new Date(2006,Calendar.DECEMBER,12)));
        clients.add(new Client("Adam3", 7, new Date(1990,Calendar.DECEMBER,1)));
        clients.add(new Client("Adam4", 171, new Date(100,Calendar.FEBRUARY,2)));
        clients.add(new Client("Adam5", 172, new Date(2004,Calendar.NOVEMBER,30)));
        System.out.println(clients);
        Collections.sort(clients);
        System.out.println(clients);

    }
}
