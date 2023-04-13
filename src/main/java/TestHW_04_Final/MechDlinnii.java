package TestHW_04_Final;

public class MechDlinnii extends HolodnoeOruzhie{

    @Override
    public int dlinaOruzhia() {
        return 80;
    }

    @Override
    public int uron() {
        return 25;
    }

    @Override
    public String toString() {
        return "Меч длинный - " + super.toString();
    }
}
