package HomeWork_OOP_04;

// клас оружие меч

public class Knife implements Weapon {

    @Override
    public int damage() {
        return 20;
    }

    public String toString() {
        return "Knife{" +
                damage() +
                "}";
    }

}

