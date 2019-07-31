package lt.bit.oop.shop;

public class Medicine extends AbstractProduct {
    private static final double MEDICINE_VAT = 1.05;

    public Medicine(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return MEDICINE_VAT;
    }
}
