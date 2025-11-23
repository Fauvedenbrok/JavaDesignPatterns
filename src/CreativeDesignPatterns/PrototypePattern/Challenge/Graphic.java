package CreativeDesignPatterns.PrototypePattern.Challenge;

public abstract class Graphic {
    private int heightInPixels;

    public Graphic(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public int getheightInPixels() {
        return  heightInPixels;
    }

    public void setheightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }
}
