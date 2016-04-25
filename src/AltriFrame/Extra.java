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
 * Questa classe permette di ottenere la soluzione del gioco inserendo una
 * password da cercare nel gioco stesso.
 *
 * @author Mario
 */
public class Extra extends JFrame {

    /**
     * Variabili di istanza
     */
    private final JButton tornaalmenù;//Bottone per ritornare al menù
    private final AcquisisciImmagine sfondo;//Immagine dello sfondo

    /**
     * Costruttore
     */
    public Extra() {

        /**
         * Attributi del frame
         */
        this.setSize(933, 700);//Dimensioni 
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("Extra");//Titolo del frame
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona del frame
        this.setBackground(null);//Sfondo di default del frame
        this.setLayout(null);//Layout di default del frame
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
        this.sfondo = new AcquisisciImmagine("/Immagini/Soluzione.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(933, 700);//Dimensioni
        add(this.sfondo);//Aggiunta dell'immagine al frame
    }
}
