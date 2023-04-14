package TestHW_04_Final;

import java.util.Random;

public class LukBolshoi extends StrelkovoeOruzhie {
    public LukBolshoi(int dalnostStrelbi) {
        super(dalnostStrelbi);
    }

    @Override
    public String vidStrelkovoeOruzhia() {
        return "Лук Большой";
    }
    @Override
    public int uron() {

        return new Random().nextInt(0, getDalnostStrelbi());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
