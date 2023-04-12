package HomeWork_OOP_04;

//клас лучника

public class Archer extends Warrior<Throwing>{  // Добавили Throwing

    public Archer(String name, int hp, Throwing weapon) {  // Weapon поменяли на Throwing
        super(name, hp, weapon);
    }

    public int getRange() {
        return rand.nextInt(weapon.getDistance()+1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +  // weapon покажи что есть , а здесь повториться
                '}';
    }
}
