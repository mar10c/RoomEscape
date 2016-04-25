package AltriFrame;

import ClassiAusiliarie.AcquisisciImmagine;
import GestioneImmagini.Resources;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * Questa classe rappresenta il desktop del computer sulla scrivania.
 *
 * @author Mario
 */
public class LinuxMint extends JFrame {

    /**
     * Variabili di istanza
     */
    private final JButton chiudisessione;//Bottone chiudi sessione
    private final AcquisisciImmagine sfondolinux;//Immagine dello sfondo

    /**
     * Costruttore
     */
    public LinuxMint() {

        /**
         * Attributi del frame
         */
        this.setSize(800, 600);//Dimensioni 
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("Mac");//Titolo
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setBackground(null);//Sfondo di default
        this.setLayout(null);//Layout di default
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Chiude il frame senza terminare l'esecuzione
        this.setResizable(false);//Non permette di ridimensionare il frame
        this.setVisible(true);//Visibilità

        /**
         * Bottone chiudi sessione
         */
        this.chiudisessione = new JButton();//Creazione
        this.chiudisessione.setBounds(380, 420, 30, 30);//Posizione e dimensioni
        this.chiudisessione.setVisible(true);//Visibilità
        this.chiudisessione.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.chiudisessione.setBorder(null);//Rimozione del bordo
        //Listener del bottone
        this.chiudisessione.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende il frame invisibile dopo il click del bottone
            }
        });
        add(chiudisessione);//Aggiunta del bottone al frame

        //Acquisizione imagine schermo linux
        this.sfondolinux = new AcquisisciImmagine("/Immagini/SchermoLinux.png");//Creazione
        this.sfondolinux.setBounds(0, 0, 800, 600);//Posizione e dimensioni
        this.sfondolinux.setVisible(true);//Visibilità
        add(sfondolinux);//Aggiunta dell'immagine al frame

    }
}
