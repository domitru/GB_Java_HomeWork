package TestHW_04_Final;

import java.util.Random;

public abstract class Warrior<T extends HolodnoeOruzhie, S extends Zashita> {
    private String name;
    private int hp;
    private T uron;
    private S zashita;

    public Warrior(String name, int hp, T uron, S zashita) {
        this.name = name;
        this.hp = hp;
        this.uron = uron;
        this.zashita = zashita;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s Здоровье: %d Оружие: %s Защита: %s ",name,hp,uron.toString(),zashita.toString());
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public T getUron() {
        return uron;
    }

    public S getZashita() {
        return zashita;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUron(T uron) {
        this.uron = uron;
    }

    public void setZashita(S zashita) {
        this.zashita = zashita;
    }
}
   // protected static Random random = new Random();






//    public Warrior(String name, String status, int hp, T uron, S zashita) {   // Weapon поменяли на T
//        super(name, status, hp);
//        this.uron = uron;
//        this.zashita = zashita;
//    }
//
//    public int harm() {
//        boolean isHit = random.nextBoolean();
//        int damage = 0;
//        if (isHit) {
//            damage = random.nextInt(uron.uron()+1);
//        }
//        return damage;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}
