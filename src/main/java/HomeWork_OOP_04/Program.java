package HomeWork_OOP_04;

public class Program {

    public static void main(String[] args) {

        Team<Swordmen_test> team1 = new Team<>();
        team1.addPersonsToTeam(new Swordmen_test("Ragnar", 250, new Sword_test(25), new SmallShield_test(30,30)))
                .addPersonsToTeam(new Swordmen_test("Laki", 200, new Sword_test(30), new SmallShield_test(50, 30)));
        for (Swordmen_test swordmen : team1) {
            System.out.println(swordmen);
        }

        Team<Archer> team2 = new Team<>();
        team2.addPersonsToTeam(new Archer("Legolas", 150, new Bow (30,200)))
                .addPersonsToTeam(new Archer("Galadriel", 130, new Bow (20,250)));
        for (Archer archer : team2) {
            System.out.println(archer);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        System.out.println(team1.minTeamArmor());
        System.out.println(team2.minTeamArmor());

//        Team<Archer> archers = new Team<>();
//        Team<Knight> knights = new Team<>();
//
//        archers.addPersons(new Archer("Robin", 100, new Bow(20)))
//                .addPersons(new Archer("Goblin", 100, new Bow(15)));
//
//        knights.addPersons(new Knight("Dubina", 150, new CWKnife()))
//                .addPersons(new Knight("Bobina", 150, new CWKnife()));
//
//        Archer archer1 = new Archer("Robin", 100, new Bow(20));
//        Archer archer2 = new Archer("Good", 100, new Bow(15));
//
//
//        Battle fight = new Battle(archer1, archer2);
//        fight.run();


    }
}
