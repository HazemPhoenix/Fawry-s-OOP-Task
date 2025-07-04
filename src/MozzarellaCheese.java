import java.time.LocalDate;

public class MozzarellaCheese extends Cheese {
    public MozzarellaCheese (String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, float weight) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired, weight, "Mozzarella Cheese");
    }
}

