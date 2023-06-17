package Instruments;

import Shop.StockItem;

public abstract class Instrument extends StockItem {
    private String manufacturer;
    private String model;
    private String material;
    private String colour;
    private String type;

    public Instrument(double buyingPrice, double sellingPrice, String manufacturer, String model, String material, String colour, String type) {
        super(buyingPrice, sellingPrice);
        this.manufacturer = manufacturer;
        this.model = model;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
