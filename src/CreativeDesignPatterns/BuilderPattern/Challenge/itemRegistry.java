package CreativeDesignPatterns.BuilderPattern.Challenge;

public class itemRegistry
{
    public static void main(String[] args)
    {
        var item1 = new StoreItem("Pretzel", 1.99, "Soft baked pretzel", "A warm, soft baked pretzel topped with salt.", 50, "each");

        var item2 = new StoreItem("Soup", 3.49, "Tomato soup", "A creamy tomato soup made with fresh tomatoes and herbs.", 30, "bowl");

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem item)
    {
        System.out.println("Adding item to registry: " + item);
    }
}