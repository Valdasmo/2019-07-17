package lt.bit.oop.shop;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Miau", 0.78);
        Product bread = new Product("Vilniaus", 1.10);

        Medicine panadol = new Medicine("Panadol", 2.54);

        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.add(milk);
        myShoppingCart.add(bread);
        myShoppingCart.add(panadol);

        System.out.println("Products price: " + myShoppingCart.getTotalPrice());
        System.out.println("Products price with VAT: " + myShoppingCart.getTotalPriceWithVat());
    }
}
