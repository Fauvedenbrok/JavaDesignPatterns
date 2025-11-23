package StructuralDesignPatterns.AdapterPattern.Challenge;

// Deze moet zodanig worden aangepast dat het duitse bericht ook kan worden gebruikt binnen de Greeting klasse. Op dit moment is dit niet mogelijk omdat de GermanLocalizedMessage klasse de LocalizedMessage interface niet implementeert. Los dit op met het adapter pattern; veranderd de code van deze klasse niet.
public class GermanLocalizedMessage {

    public void sayHallo() {
        System.out.println("Blötschkopp");
    }
}
