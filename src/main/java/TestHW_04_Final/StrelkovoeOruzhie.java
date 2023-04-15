package TestHW_04_Final;


public abstract class StrelkovoeOruzhie extends Distanzia {
    public  String name;

    public StrelkovoeOruzhie(int distance) {

        super(distance);
    }

    public abstract String vidStrelkovoeOruzhia();

    @Override
    public int uron() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Вид стрелкового оружия: %s  ",name + super.toString());
    }
}
