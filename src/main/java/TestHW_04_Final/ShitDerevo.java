package TestHW_04_Final;

public class ShitDerevo extends Zashita{
    @Override
    public int zashitaOtUrona() {
        return 15;
    }

    @Override
    public String vidZashiti() {
        return " Щит ";
    }

    @Override
    public String toString() {
        return "Щит деревянный - " + super.toString();
    }
}
