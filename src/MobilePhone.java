public class MobilePhone extends Product {
    private float screenSizeInInches;
    private int RAM;
    private int storageInGB;
    private float frontCameraQualityInMegaPixels;
    private float backCameraQualityInMegaPixels;

    public MobilePhone(String name, double price, int quantity, Manufacturer manufacturer, float screenSizeInInches, int RAM, int storageInGB, float frontCameraQualityInMegaPixels, float backCameraQualityInMegaPixels) {
        super(name, price, quantity, manufacturer);
        this.screenSizeInInches = screenSizeInInches;
        this.RAM = RAM;
        this.storageInGB = storageInGB;
        this.frontCameraQualityInMegaPixels = frontCameraQualityInMegaPixels;
        this.backCameraQualityInMegaPixels = backCameraQualityInMegaPixels;
    }

    public float getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(float screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorageInGB() {
        return storageInGB;
    }

    public void setStorageInGB(int storageInGB) {
        this.storageInGB = storageInGB;
    }

    public float getFrontCameraQualityInMegaPixels() {
        return frontCameraQualityInMegaPixels;
    }

    public void setFrontCameraQualityInMegaPixels(float frontCameraQualityInMegaPixels) {
        this.frontCameraQualityInMegaPixels = frontCameraQualityInMegaPixels;
    }

    public float getBackCameraQualityInMegaPixels() {
        return backCameraQualityInMegaPixels;
    }

    public void setBackCameraQualityInMegaPixels(float backCameraQualityInMegaPixels) {
        this.backCameraQualityInMegaPixels = backCameraQualityInMegaPixels;
    }

}
