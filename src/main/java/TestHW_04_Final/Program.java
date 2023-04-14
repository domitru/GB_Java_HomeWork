package TestHW_04_Final;

public class Program {
    public static void main(String[] args) {
        Komanda<Spartanec> sparta1 = new Komanda<>();
        Komanda<Spartanec> sparta2 = new Komanda<>();

        sparta1.addChelovek(new Spartanec("Колян", 100,new MechKorotkii(),new ShitDerevo()))
                .addChelovek(new Spartanec("Вован", 130, new MechKorotkii(), new ShitDerevo()));

        sparta2.addChelovek(new Spartanec("Серёга", 110,new MechKorotkii(),new ShitDerevo()))
                .addChelovek(new Spartanec("Петруха", 115, new MechKorotkii(), new ShitDerevo()));

//        Archer archer1 = new Archer("Robin", 100, new Bow(20));
//        Archer archer2 = new Archer("Good", 100, new Bow(15));
        Spartanec spartanec1 = new Spartanec("Колян", 100,new MechKorotkii(),new ShitDerevo());
        Spartanec spartanec2 = new  Spartanec("Серёга", 110,new MechKorotkii(),new ShitDerevo());

        Bitva fight = new Bitva(spartanec1,spartanec2);
        fight.run();
    }
}
