package CreativeDesignPatterns.BuilderPattern.Solution;

public class StoreItem
{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer quantityInStock;
    private final String unitOfMeasure;

    //de constructor waarbij we de builder class als parameter gebruiken, met de parameters van de builder class
    private StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price ;
        this.shortDescription = storeItemBuilder.shortDescription   ;
        this.longDescription = storeItemBuilder.longDescription    ;
        this.quantityInStock = storeItemBuilder.quantityInStock;
        this.unitOfMeasure = storeItemBuilder.unitOfMeasure;
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

    /*voor deze challenge heb ik de builder class genest in de StoreItem class. Het voordeel hiervan is dat de logica direct zit      inbegrepen in de class waarvoor die is gemaakt. Het houdt de implementatie netjes en er kan van buitenaf geen gebruik worden gemaakt van de builder class zonder de StoreItem class te gebruiken.
     *
     * Anderszijds kan het beter zijn om de Builder class als een aparte klasse te maken. Dit is handig wanneer je de logica voor meerdere klasses wil gebruiken (bijvoorbeeld een DTO-builder voor al je DTO's). Het nadeel is dat deze niet bij de private fields van de class kunt, tenzij je een specifieke constructor van die class maakt*/

    public static class StoreItemBuilder
    {
        private final String name; // Enkel deze  zijn verplicht dmv 'final'. Final houdt in dat ze immutable zijn
        private final Double price; // Enkel deze zijn verplicht dmv 'final'. Final houdt in dat ze immutable zijn
        private String shortDescription;
        private String longDescription;
        private Integer quantityInStock;
        private String unitOfMeasure;

        // de constructor van de builder class bevat enkel de verplichte velden
        public StoreItemBuilder(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        //dit zijn de methodes voor de optionele velden met hun setters, deze zijn niet verplicht om te gebruiken
        public StoreItemBuilder ShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public StoreItemBuilder LongDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public StoreItemBuilder quantityInStock(int quantityInStock) {
            this.quantityInStock = quantityInStock;
            return this;
        }

        public StoreItemBuilder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            return this;
        }

        //de build methode die een nieuw StoreItem object aanmaakt met de builder class als parameter, die nu kort en leesbaar is
        public StoreItem build(){
            return new CreativeDesignPatterns.BuilderPattern.Solution.StoreItem(this);
        }
    }
}
