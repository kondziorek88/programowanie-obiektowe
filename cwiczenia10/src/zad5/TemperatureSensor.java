package zad5;

public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 25;
    }

    @Override
    public String getStatus() {
        return "Ciepło";
    }

    @Override
    public void reset() {
        System.out.println("Zrestartowano termometr");

    }
}
