package lt.bit.oop.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    private List<ShoppingCartItem> items = new ArrayList<>();

    public void add(ShoppingCartItem item){
        items.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0.0;
        for (ShoppingCartItem item:items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithVat(){
        double totalPriceWithVat = 0.0;
        for (ShoppingCartItem item:items) {
            totalPriceWithVat += item.getPriceWithVat();
        }
        return totalPriceWithVat;
    }
}
