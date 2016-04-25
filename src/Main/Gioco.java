package Main;

import GestioneImmagini.Resources;
import GestioneStanze.SecondaStanza;
import GestioneStanze.PrimaStanza;
import static Main.main.menù;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Questa classe corrisponde al frame che viene visualizzato alla pressione del
 * bottone della porta sul menù principale. Su questo frame si avvicenderanno i
 * container ed i vari pannelli relativi ai muri delle stanze.
 *
 * @author Mario
 */
public class Gioco extends JFrame {

    /**
     * Variabili di istanza
     */
    private Logica logica;//Istanza della classe Logica
    protected static Dimension dimensione;//
    public static PrimaStanza primaStanza;//Istanza del container PrimaStanza
    public static SecondaStanza secondaStanza;//Istanza del container SecondaStanza

    /**
     * Costruttore
     */
    public Gioco() {

        /**
         * Inizializzazione di dimensione
         */
        dimensione = new Dimension(933, 700);//Dimensioni statiche

        /**
         * Attributi del frame
         */
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setSize(dimensione);//Dimensioni
        this.setResizable(false);//Rende il frame non ridimensionabile
        this.setLocationRelativeTo(null);//Posizione
        this.setVisible(false);//Visibilità
        this.setTitle("Room Escape");//Titolo
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//Non fa niente se si clicca sulla x di chiusura 
        //Listener sul pulsante di chiusura della finestra
        this.addWindowListener(new WindowListener() {

            @Override

            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(e.getWindow(), "Sei sicuro di voler uscire dal gioco?") == JOptionPane.OK_OPTION) {
                    setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Chiude il frame gioco
                    menù = new MenùPrincipale();//Richiama il frame Menù
                    logica = new Logica();//Richiama la classe Logica
                }
            }

            /**
             * METODI DELLA CLASSE WindowListener CHE NON VENGONO UTILIZZATI MA
             * NON POSSONO ESSERE OMESSI PERCHE' SONO RICHIESTI DALL'IDE.
             */
            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosed(WindowEvent we) {
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });

        //Inizializzazione prima stanza
        Gioco.primaStanza = new PrimaStanza(dimensione);//Creazione
        this.add(Gioco.primaStanza);//Aggiunta al frame
        this.setVisible(false);//Visibilità

        //Inizializzazione seconda stanza
        Gioco.secondaStanza = new SecondaStanza(dimensione);//Creazione
        this.add(Gioco.secondaStanza);//Aggiunta al frame
        this.setVisible(false);//Visibilità

    }

}
