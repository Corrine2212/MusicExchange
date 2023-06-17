package Instruments;

import Shop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int noOfStrings;

    public Guitar(double buyingPrice, double sellingPrice, String manufacturer, String model, String material, String colour, String type, int noOfStrings) {
        super(buyingPrice, sellingPrice, manufacturer, model, material, colour, type);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

    @Override
    public String play() {
        return "Struuuummmmmm";
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
