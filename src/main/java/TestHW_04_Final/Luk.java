package TestHW_04_Final;

public class Luk extends StrelkovoeOruzhie{

    public Luk(int dalnostStrelbi) {
        super(dalnostStrelbi);
    }

    @Override
    public String vidStrelkovoeOruzhia() {
        return "Лук средний";
    }

    @Override
    public int uron() {
        return 35;
    }

    @Override
    public int getDalnostStrelbi() {
        return dalnostStrelbi;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
