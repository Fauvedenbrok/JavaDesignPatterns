package CreativeDesignPatterns.SingletonPattern.Solution;

// een zogenaamde Lazy Singleton implementatie.

//Hieronder wordt gebruik gemaakt van een instance check, om ervoor te zorgen dat er maar 1 instance bestaat. Met de getInstance methode zorg je ervoor dat er maar één instantie van Logger wordt gemaakt. Doordat je de constructor private maakt, voorkom je dat er elders in de code nieuwe instanties van Logger kunnen worden gemaakt. In de Dog en Cat klassen wordt vervolgens altijd dezelfde instantie van Logger gebruikt.
//
//Dit is echter niet Thread safe. Wanneer er meerdere threads (of coroutines tegelijk lopen, dan kunnen zowel Dog als Cat beide tegelijk de instance checken en aanmaken. In dat geval heb je alsnog 2 instanties. De oplossing beneden laat een thread-safe versie zien*/
//
// public final class Logger {
//    private Logger() {
//    }
//    private static Logger INSTANCE;
//
//    public static Logger getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new Logger();
//        }
//        return INSTANCE;
//    }
//
//    void log(String logMessage) {
//        System.out.println(logMessage);
//    }
//}


//Thread-safe Singleton implementatie, door gebruik te maken van een Enum klasse. Enum klassen zijn áltijd thread-safe. Hier zorgt de JVM namelijk voor (hetzelfde geldt dus voor Kotlin)
public enum Logger {
    INSTANCE;

    private Logger logger;

    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}


