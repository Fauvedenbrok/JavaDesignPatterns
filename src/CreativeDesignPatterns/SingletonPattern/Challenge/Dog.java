package CreativeDesignPatterns.SingletonPattern.Challenge;

public class Dog {

    private final Logger logger =  new Logger();

    public void woof() {
        logger.log("Woof!");
    }
}
