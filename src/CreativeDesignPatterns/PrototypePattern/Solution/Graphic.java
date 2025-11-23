package CreativeDesignPatterns.PrototypePattern.Solution;

public abstract class Graphic { //het is good practice om een abstracte klasse te maken als je wilt dat andere klassen hiervan erven, op die manier voorkom je dat er per ongeluk een instantie van deze klasse wordt gemaakt
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

    public abstract Graphic clone(); //het is good practice om deze methode in dit geval altijd clone te noemen
}
