package CreativeDesignPatterns.SingletonPattern.Challenge;

public class Cat {

    private final Logger logger =  new Logger();

    public void meow() {
        logger.log("Meow!");
    }
}
