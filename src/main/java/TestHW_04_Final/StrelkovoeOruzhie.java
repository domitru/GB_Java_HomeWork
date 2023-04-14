package TestHW_04_Final;


public abstract class StrelkovoeOruzhie extends Distanzia implements Weapon {
    public abstract String vidStrelkovoeOruzhia();
    public  int dalnostStrelbi;

    public StrelkovoeOruzhie(int dalnostStrelbi) {

        super(dalnostStrelbi);
    }

    public int getDalnostStrelbi() {

        return dalnostStrelbi;
    }

    @Override
    public String toString() {
        return String.format("Вид стрелкового оружия: %s Дальность стрельбы: %d Урон %d ",vidStrelkovoeOruzhia(),dalnostStrelbi,uron());
    }
}
