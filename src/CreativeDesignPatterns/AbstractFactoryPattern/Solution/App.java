package CreativeDesignPatterns.AbstractFactoryPattern.Solution;

public class App {

    public static void main(String[] args) {
        UserInterface redUserInterface = createUserInterface("Red");
        UserInterface blueUserInterface = createUserInterface("Blue");

        System.out.println(redUserInterface);
        System.out.println(blueUserInterface);
    }

    private static UserInterface createUserInterface(String color) {
       var userInterfaceFactory = FactoryMaker.createFactory(color);
       var button = userInterfaceFactory.createButton();
       var scrollbar = userInterfaceFactory.createScrollbar();
         return new UserInterface(button, scrollbar);
    }
}
