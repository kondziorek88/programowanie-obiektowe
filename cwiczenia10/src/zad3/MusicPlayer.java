package zad3;

public interface MusicPlayer {
    default void turnOn() {
        System.out.println("Radio włączone");
    }
    default void turnOff(){
        System.out.println("Radio wyłączone");
    }
    default void nextTrack(){
        System.out.println("Zmienino stacje radiową");
    }


}
