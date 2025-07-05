package Products;

import Manufacturer.Manufacturer;

import java.time.LocalDate;

public abstract class ExpirableProduct extends Product {
    private LocalDate expiryDate;
    private Boolean isExpired;

    protected ExpirableProduct(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired) {
        super(name, price,quantity, manufacturer);
        this.expiryDate = expiryDate;
        this.isExpired = isExpired;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean expired) {
        isExpired = expired;
    }
}
