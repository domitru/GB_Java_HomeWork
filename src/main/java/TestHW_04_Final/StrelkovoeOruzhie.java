package TestHW_04_Final;


public abstract class StrelkovoeOruzhie implements UronOtOrugia {
    public abstract String vidStrelkovoeOruzhia();
    public  int dalnostStrelbi;

    public StrelkovoeOruzhie(int dalnostStrelbi) {
        this.dalnostStrelbi = dalnostStrelbi;
    }

    public int getDalnostStrelbi() {
        return dalnostStrelbi;
    }

    @Override
    public String toString() {
        return String.format("Вид стрелкового оружия: %s Дальность стрельбы: %d Урон %d ",vidStrelkovoeOruzhia(),dalnostStrelbi,uron());
    }
}
