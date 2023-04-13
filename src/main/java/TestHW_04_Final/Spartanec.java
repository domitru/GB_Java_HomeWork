package TestHW_04_Final;

public class Spartanec extends Warrior<MechKorotkii, ShitDerevo>{
    public Spartanec(String name,int hp, MechKorotkii uron, ShitDerevo zashita) {
        super(name, hp, uron, zashita);
    }

    @Override
    public String toString() {
        return "Лучник-" + super.toString();
    }
}
