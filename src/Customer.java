import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private Cart cart;
    private double balance;
    private Store store;

    public Customer(String name, String address, String phoneNumber, double balance, Store store) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.cart = new Cart();
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Cart getCart() {
        return cart;
    }

    public void checkout() {
        store.checkoutCustomer(this);
    }
}
