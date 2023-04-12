package HomeWork_OOP_04;

//клас воин

import java.util.Random;

public class Warrior<T extends Weapon> extends Person {  // <T extends Weapon> делает обобщение

    protected T weapon;  // <<-- пишем вместо -->> protected Weapon weapon;
    protected static Random rand = new Random();


    public Warrior(String name, int hp, T  weapon) {   // Weapon поменяли на T
        super(name, hp);
        this.weapon = weapon;
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name " + getName() +
                " hp = " + getHp() +
                " weapon = " + weapon +
                '}';
    }
}
