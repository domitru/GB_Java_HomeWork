package HomeWork_OOP_05.path1Calculate;

public class Program {
    public static void main(String[] args) {


        CalculateComplex calcCompl1 = new CalculateComplex(15, 37);
        calcCompl1.setW(2.0);
        calcCompl1.setZ(3.3);
        System.out.printf("sum = " + calcCompl1.sum());

        CalculateComplex calcCompl2 = new CalculateComplex(15, 37);
        calcCompl2.setW(2.0);
        calcCompl2.setZ(3.3);
        System.out.printf("sum = " + calcCompl1.sub());
    }
}
