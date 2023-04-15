package TestHW_04_Final;

public class Program {
    public static void main(String[] args) {
        Komanda<Spartanec> spartanecs = new Komanda<>();
        Komanda<Luchnik> luchniks = new Komanda<>();

        luchniks.addChelovek(new Luchnik("Колян", 100,new LukSrednii(100)))
                .addChelovek(new Luchnik("Вован", 130, new LukBolshoi(200)));

        spartanecs.addChelovek(new Spartanec("Серёга", 110,new MechKorotkii(),new ShitDerevo()))
                .addChelovek(new Spartanec("Петруха", 115, new MechKorotkii(), new ShitDerevo()));

//        Archer archer1 = new Archer("Robin", 100, new Bow(20));
//        Archer archer2 = new Archer("Good", 100, new Bow(15));

        Spartanec spartanec1 = new Spartanec("Колян", 100,new MechKorotkii(),new ShitDerevo());
        Luchnik luchnik1 = new Luchnik("Вован", 130, new LukBolshoi(200));
       //Spartanec spartanec2 = new Spartanec("Серёга", 110,new MechKorotkii(),new ShitDerevo());
      // Spartanec spartanec3 = new Spartanec("Петруха", 115, new MechKorotkii(), new ShitDerevo());

       // Bitva fight = new Bitva(spartanec1,luchnik1);
        Bitva fight = new Bitva(spartanecs.cheloveks.get(1),luchniks.cheloveks.get(0));
        fight.run();
    }
}
