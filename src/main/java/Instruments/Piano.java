package Instruments;

import Shop.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private int noOfKeys;

    public Piano(double buyingPrice, double sellingPrice, String manufacturer, String model, String material, String colour, String type, int noOfKeys) {
        super(buyingPrice, sellingPrice, manufacturer, model, material, colour, type);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    @Override
    public String play() {
        return "Dun dun dun duuuuuuuun";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
