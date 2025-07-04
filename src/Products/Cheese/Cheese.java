package Products.Cheese;

import Manufacturer.Manufacturer;
import Products.ExpirableProduct;
import Shipping.Shippable;

import java.time.LocalDate;

public abstract class Cheese extends ExpirableProduct implements Shippable {
    private double weight;
    private String type;

    protected Cheese(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, float weight, String type) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired);
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
