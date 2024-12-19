package zad3;

public class Radio implements MusicPlayer{

    @Override
    public void turnOn() {
        MusicPlayer.super.turnOn();
    }

    @Override
    public void turnOff() {
        MusicPlayer.super.turnOff();
        }
        @Override
        public void nextTrack() {
            MusicPlayer.super.nextTrack();
        }


    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.nextTrack();
    }

}
