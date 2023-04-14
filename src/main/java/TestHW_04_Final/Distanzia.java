package TestHW_04_Final;

public abstract class Distanzia implements Weapon{
    private int distance;

    public Distanzia(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("Дистанция: %d Урон: %d ",distance, uron());

    }
}
