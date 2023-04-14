package TestHW_04_Final;

import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Zashita> extends Chelovek{
    protected static Random random = new Random();
    T uron;
    S zashita;


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
        int damage = 0;
        if (isHit) {
            damage = random.nextInt(uron.uron()+1);
        }
        return damage;
    }
}




