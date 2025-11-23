package CreativeDesignPatterns.AbstractFactoryPattern.Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UserInterfaceFactory>> userInterfaceFactories = new HashMap<>();

    static {
        userInterfaceFactories.put("Blue", BlueUserInterfaceFactory::new);
        userInterfaceFactories.put("Red", RedUserInterfaceFactory::new);
    }

    public static  UserInterfaceFactory createFactory(String color){
        if(userInterfaceFactories.get(color) != null){
            return userInterfaceFactories.get(color).get();
        } else {
            throw new IllegalArgumentException("color not supported");
        }
    }
}
