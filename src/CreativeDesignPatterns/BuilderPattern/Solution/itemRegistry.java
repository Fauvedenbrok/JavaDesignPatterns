package CreativeDesignPatterns.BuilderPattern.Solution;

public class itemRegistry
{
    public static void main(String[] args)
    {
        var item1 = new StoreItem.StoreItemBuilder("Pretzels", 2.99)
                .ShortDescription("Crunchy salted pretzels")
                .build();

        var item2 = new StoreItem.StoreItemBuilder("Soup", 4.49)
                .quantityInStock(50)
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem item)
    {
        System.out.println("Adding item to registry: " + item);
    }
}