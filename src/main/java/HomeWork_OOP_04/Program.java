package HomeWork_OOP_04;

public class Program {

    public static void main(String[] args) {

        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();

        archers.addPersons(new Archer("Robin", 100, new Bow(20)))
                .addPersons(new Archer("Goblin", 100, new Bow(15)));

        knights.addPersons(new Knight("Dubina", 150, new Knife()))
                .addPersons(new Knight("Bobina", 150, new Knife()));

        Archer archer1 = new Archer("Robin", 100, new Bow(20));
        Archer archer2 = new Archer("Good", 100, new Bow(15));


        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}
