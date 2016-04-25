package SecondaStanza;

import ClassiAusiliarie.AcquisisciImmagine;
import Main.Gioco;
import static Main.Gioco.primaStanza;
import static Main.Gioco.secondaStanza;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro posteriore della seconda
 * stanza.
 *
 * @author Mario
 */
public class MuroPosterioreSecondaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo;//Immagine di sfondo
    private final JButton frecciaSinistra, frecciaDestra, porta;//Immagini frecce e porta

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroPosterioreSecondaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensione
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Bottone porta per prima stanza
         */
        this.porta = new JButton();//Creazione
        this.porta.setBounds(385, 255, 162, 300);//Posizione e dimensioni
        this.porta.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaChiusa.png")));//Immagine
        this.porta.setPressedIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaAperta.png")));//Immagine alla pressione del bottone
        this.porta.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.porta.setBorder(null);//Rimuove il bordo 
        this.porta.setVisible(true);//Visibilità
        //Listener
        this.porta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende il pannello invisibile
                secondaStanza.setVisible(false);//Rende il container invisibile
                primaStanza.setVisible(true);//Rende il container visibile
                primaStanza.getMuroPosteriorePrimaStanza().setVisible(true);//Rende il pannello visibile
            }
        });
        add(this.porta);//Aggiunge il bottone al pannello

        /**
         * Bottone freccia sinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Posizione e dimensione
        this.frecciaSinistra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimuove il bordo
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.frecciaSinistra.setVisible(true);//Visibilità
        //Listener
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende questo pannello invisibile
                Gioco.secondaStanza.getMuroDestroSecondaStanza().setVisible(true);//Rende un altro pannello visibile
            }
        });
        add(this.frecciaSinistra);//Aggiunta del bottone al pannello

        /**
         * Bottone freccia destra
         */
        this.frecciaDestra = new JButton();//Creazione
        this.frecciaDestra.setBounds(865, 485, 56, 62);//Posizione e dimensioni
        this.frecciaDestra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaDestra.setBorder(null);//Rimuove il bordo
        this.frecciaDestra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaDestra.png")));//Immagine
        this.frecciaDestra.setVisible(true);
        //Listener
        this.frecciaDestra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile questo pannello
                Gioco.secondaStanza.getMuroSinistroSecondaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunge il bottone al pannello

        /**
         * Immagine dello sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensione
        add(this.sfondo);//Aggiunta dell'immagine al pannello
    }

}
