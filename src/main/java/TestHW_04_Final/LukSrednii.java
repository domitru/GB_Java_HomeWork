package TestHW_04_Final;

import java.util.Random;

public class LukSrednii extends StrelkovoeOruzhie{

    public LukSrednii(int distance) {
        super(distance);
    }

    @Override
    public String vidStrelkovoeOruzhia() {
        return "Лук средний";
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
