package TestHW_04_Final;

public abstract class HolodnoeOruzhie implements Weapon {

    public abstract int dlinaOruzhia();

    @Override
    public String toString() {
        return String.format(" Длина оружия: %d Урон: %d ",dlinaOruzhia(),uron());
    }
}
