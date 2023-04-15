package TestHW_04_Final;

public class Spartanec extends Warrior<MechKorotkii, ShitDerevo>{
    private int speed;
    public Spartanec(String name,int hp, MechKorotkii uron, ShitDerevo zashita) {
        super(name, hp, uron, zashita);
        this.speed = random.nextInt(4, 12) - zashita.ves();
    }


    @Override
    public String toString() {
        return "Спартанец : " +  " скорость "
                + this.getSpeed() + super.toString()
                + String.format(" with %s protection %d", zashita.getClass(), zashita.protect());
    }

    public int getSpeed() {
        return speed;
    }
}
