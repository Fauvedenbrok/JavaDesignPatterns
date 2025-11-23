package CreativeDesignPatterns.AbstractFactoryPattern.Challenge;

public class App {

    public static void main(String[] args) {
        UserInterface redUserInterface = createUserInterface("red");
        UserInterface blueUserInterface = createUserInterface("blue");

        System.out.println(redUserInterface);
        System.out.println(blueUserInterface);
    }

    private static UserInterface createUserInterface(String color) {
        if (color.equalsIgnoreCase("Red")) {
            return new UserInterface(new RedButton(), new RedScrollbar());
        } else if (color.equalsIgnoreCase("Blue")) {
            return new UserInterface(new BlueButton(), new BlueScrollbar());
        } else {
            throw new IllegalArgumentException("color not supported");
        }
    }
}
