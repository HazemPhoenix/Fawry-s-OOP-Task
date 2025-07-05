package Products.Cheese;

import Manufacturer.Manufacturer;

import java.time.LocalDate;

public class BlueCheese extends Cheese {
    public BlueCheese(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, float weight) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired, weight, "Blue Products.Cheese.Cheese");
    }
}

