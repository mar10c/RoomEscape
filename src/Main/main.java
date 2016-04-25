package Main;

/**
 * Questa classe manda in esecuzione l'applicazione richiamando il costruttore
 * della classe MenùPrincipale e quello della classe Logica.
 *
 * @author Mario
 */
public class main {

    /**
     * Variabili di istanza
     */
    public static MenùPrincipale menù;//Istanza della class MenùPrincipale
    public static Logica logica;//Istanza della classe Logica

    /**
     * @param args
     */
    public static void main(String[] args) {

        menù = new MenùPrincipale();//Si richiama il costruttore della classe MenùPrincipale   
        logica = new Logica();//Si richiama il costruttore della classe Logica
    }
}
