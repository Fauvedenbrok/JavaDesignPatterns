package CreativeDesignPatterns.FactoryMethodPattern.Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackMap = new HashMap<>(); //om ervoor te zorgen dat het geen eindeloze else-if wordt; maken we een hashmap aan voor de soorten snacks

    static {
        snackMap.put("Drink", Drink::new);
        snackMap.put("Chips", Chips::new);
        snackMap.put("ChocolateBar", ChocolateBar::new);
    } //deze notatie volstaat, maar als hier meer logica bij komt kijken, is het beter om een lambda expressie te gebruiken

    Snack getSnack(String snackType) {
        if (snackMap.get(snackType) != null) {
            return snackMap.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Invalid snackType.");
        }
    }
}
