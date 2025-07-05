package Products;

import Manufacturer.Manufacturer;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;
    private Manufacturer manufacturer;

    protected Product(String name, double price, int quantity, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price)  {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity)  {
        this.quantity = quantity;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer)  {
        this.manufacturer = manufacturer;
    }
}
