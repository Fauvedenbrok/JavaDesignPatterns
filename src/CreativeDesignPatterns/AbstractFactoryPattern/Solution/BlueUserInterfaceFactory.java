package CreativeDesignPatterns.AbstractFactoryPattern.Solution;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {

    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new BlueScrollbar();
    }
}
