package Products.Cheese;

import Manufacturer.Manufacturer;

import java.time.LocalDate;

public class CheddarCheese extends Cheese {
    public CheddarCheese(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, float weight) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired, weight, "Cheddar Products.Cheese.Cheese");
    }
}

