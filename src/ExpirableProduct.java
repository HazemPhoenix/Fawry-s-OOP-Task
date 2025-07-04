import java.util.Date;

public abstract class ExpirableProduct {
    private Date expiryDate;
    private Boolean isExpired;

    protected ExpirableProduct(Date expiryDate, Boolean isExpired) {
        this.expiryDate = expiryDate;
        this.isExpired = isExpired;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }
}
