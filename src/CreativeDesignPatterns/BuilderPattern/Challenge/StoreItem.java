package CreativeDesignPatterns.BuilderPattern.Challenge;

public class StoreItem
{
    private final String name;
    private final double price;
    private final String shortDescription;
    private final String longDescription;
    private final int quantityInStock;
    private final String unitOfMeasure;

    public StoreItem(String name, double price, String shortDescription, String longDescription, int quantityInStock, String unitOfMeasure) {
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.quantityInStock = quantityInStock;
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return "CreativeDesignPatterns.BuilderPattern.Challenge.StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                '}';
    }
}
