import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    private double totalPrice;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product item, int quantity) {
        if(quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        else if(quantity > item.getQuantity()) {
            throw new IllegalArgumentException("Quantity must be less than " + item.getQuantity());
        }
        this.items.add(new CartItem(item, quantity));
    }

    public void removeItem(Product item) {
        for(CartItem cartItem: items) {
            if(cartItem.getProduct().equals(item)) {
                this.items.remove(cartItem);
                return;
            }
        }
        throw new IllegalArgumentException("Item not found");
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void printItems() {
        for (CartItem cartItem : this.items) {
            cartItem.printReceipt();
        }
    }

    public void clearCart() {
        this.items.clear();
    }

    private double calculateShippingPrice() {
        double totalShippingPrice = 0d;
        for (CartItem cartItem : this.items) {
            totalShippingPrice += cartItem.getShippingPrice();
        }
        return Math.round(totalShippingPrice * 100d) / 100d;
    }

    private double calculatePriceBeforeShipping() {
        double priceBeforeShipping = 0d;
        for (CartItem cartItem : this.items) {
            priceBeforeShipping += cartItem.getPriceBeforeShipping();
        }
        return Math.round(priceBeforeShipping * 100d) / 100d;
    }

    public double calculateTotalPrice() {
        this.totalPrice = calculateShippingPrice() + calculatePriceBeforeShipping();
        return Math.round(this.totalPrice * 100d) / 100d;
    }

    public void printReceipt() {
        for (CartItem cartItem : this.items) {
            cartItem.printReceipt();
        }
        System.out.println("-------------------");
        System.out.println("Order Subtotal: " + calculatePriceBeforeShipping() + "EGP");
        System.out.println("Shipping Fees: " + calculateShippingPrice() + "EGP");
        System.out.println("Total price: " + calculateTotalPrice() + "EGP");

    }
}
