package Store;

import Cart.Cart;
import Cart.CartItem;
import Products.ExpirableProduct;
import Products.Product;
import Shipping.Shippable;
import Shipping.EgyptExpress;
import Shipping.ShippingService;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> products;
    ShippingService shippingService;

    public Store() {
        this.products = new ArrayList<>();
        this.shippingService = new EgyptExpress();
    }

    public Store(ArrayList<Product> products) {
        this.products = products;
        this.shippingService = new EgyptExpress();
    }

    public Store(ArrayList<Product> products, ShippingService shippingService) {
        this.products = products;
        this.shippingService = shippingService;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        if(this.products.contains(product)) {
            this.products.remove(product);
        } else {
            throw new IllegalArgumentException("Products.Product not in store");
        }
    }

    public void listAllProducts() {
        for(Product product : this.products) {
            System.out.println("Name: " + product.getName() + " Price: " + product.getPrice() + " Quantity: " + product.getQuantity());
        }
    }

    public void useShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    private void validateItems(Cart cart) {
        ArrayList<CartItem> items = cart.getItems();
        for (CartItem item : items) {
            if(item.getProduct().getQuantity() < 0) {
                throw new IllegalStateException("Products.Product: " + item.getProduct().getName() + "is out of stock.");
            } else if (item.getProduct() instanceof ExpirableProduct && (((ExpirableProduct) item.getProduct()).getIsExpired())) {
                throw new IllegalStateException("Products.Product: " + item.getProduct().getName() + "is expired.");
            }
        }
    }

    private ArrayList<Shippable> filterProducts(ArrayList<CartItem> items) {
        ArrayList<Shippable> filteredItems = new ArrayList<>();
        for(CartItem item : items) {
            if(item.getProduct() instanceof Shippable) {
                for(int i = 0; i < item.getQuantity(); i++) {
                    filteredItems.add((Shippable) item.getProduct());
                }
            }
        }
        return filteredItems;
    }

    public void checkoutCustomer(Customer customer) {
        Cart customerCart = customer.getCart();
        double totalPrice = customerCart.calculateTotalPrice();
        if (totalPrice > customer.getBalance()) {
            throw new IllegalStateException("Insufficient funds");
        } else if (customerCart.getItems().isEmpty()) {
            throw new IllegalStateException("Empty cart");
        } else {
            validateItems(customerCart);
            for(CartItem cartItem : customerCart.getItems()) {
                int boughtQuantity = cartItem.getQuantity();
                int productQuantity = cartItem.getProduct().getQuantity();
                if(boughtQuantity > productQuantity) {
                    throw new IllegalStateException("Quantity for product: " + cartItem.getProduct().getName() + " must be less than " + boughtQuantity);
                } else {
                    cartItem.getProduct().setQuantity(productQuantity - boughtQuantity);
                }
            }
        }
        customer.setBalance(customer.getBalance() - totalPrice);
        System.out.println("** Shipment notice **");
        shippingService.shipItems(filterProducts(customerCart.getItems()));
        System.out.println("** Checkout receipt **");
        customerCart.printReceipt();
        System.out.println("Current Balance: " + customer.getBalance());
        customerCart.clearCart();
    }
}
