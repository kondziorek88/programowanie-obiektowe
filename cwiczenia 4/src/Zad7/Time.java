package Zad7;

public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public static Time addTime(Time time, Time otherTime){
        time.minutes += otherTime.minutes;
        if(time.minutes>59){
            time.minutes = (time.minutes%60);
            time.hours+=1;
        }
        time.hours += otherTime.hours;
        if(time.hours>23){
            time.hours = (time.hours%24);
        }

        return time;

    }
}
