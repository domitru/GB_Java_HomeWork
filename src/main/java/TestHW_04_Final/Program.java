package TestHW_04_Final;

public class Program {
    public static void main(String[] args) {
        //ShitDerevo sd = new ShitDerevo();
//        ShitMetall sm = new ShitMetall();

//        MechDlinnii md = new MechDlinnii();
        //MechKorotkii mk = new MechKorotkii();

//        LukBolshoi lb = new LukBolshoi(123);

        Spartanec spartanec = new Spartanec("Санёк", 300,new MechKorotkii(), new ShitDerevo());


        System.out.println(spartanec);
        //System.out.println(mk);
    }
}
