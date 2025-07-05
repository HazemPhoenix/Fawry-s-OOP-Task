package Products.Cheese;

import Manufacturer.Manufacturer;

import java.time.LocalDate;

public class CreamCheese extends Cheese {
    public CreamCheese(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, float weight) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired, weight, "Cream Products.Cheese.Cheese");
    }
}
