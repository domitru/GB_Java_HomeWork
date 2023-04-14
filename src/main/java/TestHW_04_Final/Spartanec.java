package TestHW_04_Final;

public class Spartanec extends Warrior<MechKorotkii, ShitDerevo>{
    private int speed;
    public Spartanec(String name,int hp, MechKorotkii uron, ShitDerevo zashita) {
        super(name, hp, uron, zashita);
        this.speed = random.nextInt(4, 12);
    }


    @Override
    public String toString() {
        return "Спартанец : " +  " скорость "
                + this.getSpeed() + super.toString();
    }

    public int getSpeed() {
        return speed;
    }
}
