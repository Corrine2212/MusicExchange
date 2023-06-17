package Shop;

public class DrumSticks extends StockItem implements ISell{
    private String manufacturer;
    private String material;

    public DrumSticks(double buyingPrice, double sellingPrice, String manufacturer, String material) {
        super(buyingPrice, sellingPrice);
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
