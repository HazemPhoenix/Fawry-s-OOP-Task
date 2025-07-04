public class MobileScratchCard extends Product {
    private Boolean isUsed;
    private float capacityInGB;

    public MobileScratchCard(String name, double price, int quantity, Manufacturer manufacturer, Boolean isUsed, float capacityInGB) {
        super(name, price, quantity, manufacturer);
        this.isUsed = isUsed;
        this.capacityInGB = capacityInGB;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void use() {
        this.isUsed = true;
    }

    public float getCapacityInGB() {
        return capacityInGB;
    }

    public void setCapacityInGB(float capacityInGB) {
        this.capacityInGB = capacityInGB;
    }
}

