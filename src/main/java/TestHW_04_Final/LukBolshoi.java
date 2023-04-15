package TestHW_04_Final;

import java.util.Random;

public class LukBolshoi extends StrelkovoeOruzhie {
    public LukBolshoi(int distance) {
        super(distance);
    }

    @Override
    public String vidStrelkovoeOruzhia() {
        return "Лук Большой";
    }
    @Override
    public int uron() {

        return new Random().nextInt(0, getDistance());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
