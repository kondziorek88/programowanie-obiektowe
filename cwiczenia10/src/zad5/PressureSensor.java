package zad5;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 1000;
    }

    @Override
    public String getStatus() {
        return "Wysokie ciśnienie";
    }

    @Override
    public void reset() {
        System.out.println("zresetowano sensor");

    }
}
