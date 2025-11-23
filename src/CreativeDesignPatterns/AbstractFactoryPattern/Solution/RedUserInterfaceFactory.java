package CreativeDesignPatterns.AbstractFactoryPattern.Solution;

public class RedUserInterfaceFactory implements UserInterfaceFactory{

    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new RedScrollbar();
    }
}
