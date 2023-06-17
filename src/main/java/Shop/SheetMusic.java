package Shop;

public class SheetMusic extends StockItem implements ISell{
    private String songName;
    private String songArtist;

    public SheetMusic(double buyingPrice, double sellingPrice, String songName, String songArtist) {
        super(buyingPrice, sellingPrice);
        this.songName = songName;
        this.songArtist = songArtist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    @Override
    public double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
