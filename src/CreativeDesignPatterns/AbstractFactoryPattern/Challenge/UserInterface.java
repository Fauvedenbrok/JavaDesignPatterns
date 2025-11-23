package CreativeDesignPatterns.AbstractFactoryPattern.Challenge;

public class UserInterface {

    private Button button;
    private Scrollbar scrollbar;

    public UserInterface(Button button, Scrollbar scrollbar) {
        this.button = button;
        this.scrollbar = scrollbar;
    }

    public Button getButton() {
        return button;
    }

    public Scrollbar getScrollbar() {
        return scrollbar;
    }

    @Override
    public String toString() {
        return "UserInterface";
    }
}
