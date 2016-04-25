package AltriFrame;

import ClassiAusiliarie.AcquisisciImmagine;
import GestioneImmagini.Resources;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * Questa classe rappresenta il frame dove ci sono le informazioni riguardo al
 * gioco e allo sviluppatore.
 *
 * @author Mario
 */
public class Informazioni extends JFrame {

    /**
     * Variabili di istanza
     */
    private final JButton tornaalmenù;//Bottone torna al menù
    private final AcquisisciImmagine sfondo;//Immagine di sfondo

    /**
     * Costruttore
     */
    public Informazioni() {

        /**
         * Attributi del frame
         */
        this.setSize(933, 700);//Dimensioni
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("Informazioni");//Titolo
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setBackground(null);//Sfondo di default
        this.setLayout(null);//Layout di default
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Chiude il frame corrente senza terminare l'esecuzione
        this.setResizable(false);//Non permette di ridimensionare il frame
        this.setVisible(true);//Visibilità

        /**
         * Bottone torna al menù
         */
        this.tornaalmenù = new JButton();//Creazione
        this.tornaalmenù.setBounds(680, 603, 56, 62);//Posizione e dimensioni
        this.tornaalmenù.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.tornaalmenù.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.tornaalmenù.setBorder(null);//Rimozione del bordo
        this.tornaalmenù.setVisible(true);//Visibilità
        //Listener
        this.tornaalmenù.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile il frame
            }
        });
        add(this.tornaalmenù);//Aggiunta del bottone al frame

        /**
         * Immagine di sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Informazioni.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(933, 700);//Dimensioni
        add(this.sfondo);//Aggiunta dell immagine al frame
    }
}
