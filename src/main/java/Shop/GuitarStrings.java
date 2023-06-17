package Shop;

public class GuitarStrings extends StockItem implements ISell{
    private String manufacturer;
    private String gauge;

    public GuitarStrings(double buyingPrice, double sellingPrice, String manufacturer, String gauge) {
        super(buyingPrice, sellingPrice);
        this.manufacturer = manufacturer;
        this.gauge = gauge;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGauge() {
        return gauge;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }

    @Override
    public double calculateMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
