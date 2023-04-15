package TestHW_04_Final;

public class Luchnik extends Warrior<StrelkovoeOruzhie, ShitMetall>{
    public Luchnik(String name, int hp, StrelkovoeOruzhie uron) {

        super(name, hp, uron, new ShitMetall());
    }

    public int getRange() {
        return random.nextInt(uron.getDistance()+1);
    }

    @Override
    public String toString() {
        return "Luchnic " + super.toString();
    }
}
