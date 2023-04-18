package HomeWork_OOP_05.path1Calculate;

public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {
    public CalculateComplex(double x, double y) {
        super(x, y);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x+w), (y+z));
    }

    @Override
    public ComplexNumbers sub() {
        return new ComplexNumbers((x - w), (y - z));
    }

    @Override
    public ComplexNumbers mult() {
        return new ComplexNumbers((x * w), (y * z));
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers((x / w), (y / z));
    }


}
