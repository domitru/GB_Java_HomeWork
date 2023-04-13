package TestHW_04_Final;

public class MechKorotkii extends HolodnoeOruzhie {

    @Override
    public int dlinaOruzhia() {
        return 15;
    }

    @Override
    public int uron() {
        return 10;
    }


    @Override
    public String toString() {
        return "Меч короткий - " + super.toString();
    }
}
