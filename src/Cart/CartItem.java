package Cart;

import Products.Product;
import Shipping.Shippable;

public class CartItem {
    private Product product;
    private int quantity;
    private double price;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) this.quantity = quantity;
        else if(quantity < 0) new IllegalArgumentException("Quantity must be greater than 0");
        else if (quantity > product.getQuantity()) throw new IllegalArgumentException("Quantity must be less than " + product.getQuantity());
    }

    public double getPriceBeforeShipping() {
        return Math.round(price * 100d) / 100d;
    }

    public double getShippingPrice() {
        if(product instanceof Shippable) {
            Shippable shippable = (Shippable) product;
            double weight = shippable.getWeight() * quantity;
            return Math.round((weight * 10) * 100d) / 100d;
        }
        return 0;
    }

    public double getTotalPrice() {
        return Math.round((getPriceBeforeShipping() + getShippingPrice()) * 100d) / 100d;
    }

    public void printReceipt() {
        System.out.println(product.getName() + " x" + quantity + " -> " + getTotalPrice() + "EGP");
    }
}
