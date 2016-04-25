package AltriFrame;

import ClassiAusiliarie.AcquisisciImmagine;
import GestioneImmagini.Resources;
import Main.Logica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 * Questa classe rappresenta il frame che viene visualizato quando viene vinto
 * il gioco.
 *
 * @author Mario
 */
public class Vittoria extends JFrame {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo;//Immagine di sfondo
    public Logica logica;
    private final JButton tornaalgioco;

    /**
     * Costruttore
     */
    public Vittoria() {

        /**
         * Attrubuti del frame
         */
        this.setSize(933, 700);//Dimensioni 
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("VITTORIA!");//Titolo 
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setBackground(null);//Sfondo di default
        this.setLayout(null);//Layout di default
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Chiude il frame senza terminare l'esecuzione
        this.setResizable(false);//Non permette di ridimensionare il frame
        this.setVisible(true);//Visibilità

        /**
         * Bottone torna al menù
         */
        this.tornaalgioco = new JButton();//Creazione
        this.tornaalgioco.setBounds(800, 603, 56, 62);//Posizione e dimensioni
        this.tornaalgioco.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.tornaalgioco.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.tornaalgioco.setBorder(null);//Rimozione del bordo
        this.tornaalgioco.setVisible(true);//Visibilità
        //Listener
        this.tornaalgioco.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile il frame
            }
        });
        add(this.tornaalgioco);//Aggiunta del bottone al frame

        /**
         * Immagine di sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Vittoria.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(933, 700);//Dimensioni
        add(this.sfondo);//Aggiunta dell'immagine al frame 

    }
}
