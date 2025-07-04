public class TV extends Product implements Shippable {
    private float screenSizeInInches;
    private double weight;

    public TV(String name, double price, int quantity, Manufacturer manufacturer, float screenSizeInInches, float weight) {
        super(name, price, quantity, manufacturer);
        this.screenSizeInInches = screenSizeInInches;
        this.weight = weight;
    }

    public float getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(float screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
