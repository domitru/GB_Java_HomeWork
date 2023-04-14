package TestHW_04_Final;

import java.util.Random;

public abstract class Warrior<T extends HolodnoeOruzhie, S extends Zashita> extends Chelovek{
    protected static Random random = new Random();
    private T uron;
    private S zashita;


    public Warrior(String name, int hp, T uron, S zashita) {
        super(name, hp);
        this.uron = uron;
        this.zashita = zashita;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s Здоровье: %d Оружие: %s Защита: %s ",super.getName(),super.getHp(),uron.toString(),zashita.toString());
    }



    public int harm() {
        boolean isHit = random.nextBoolean();
        int damageUron = 0;
        if (isHit) {
            damageUron = random.nextInt(uron.uron()+1);
        }
        return damageUron;
    }
}




