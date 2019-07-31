package lt.bit.oop.shop;

public abstract class AbstractProduct implements ShoppingCartItem{
    private String name;
    private double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVat(){
        return this.price * this.getVat();
    }

    public abstract double getVat();
}
