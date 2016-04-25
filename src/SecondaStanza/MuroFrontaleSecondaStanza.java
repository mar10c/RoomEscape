package SecondaStanza;

import ClassiAusiliarie.*;
import Main.Gioco;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro frontale della seconda
 * stanza.
 *
 * @author Mario
 */
public class MuroFrontaleSecondaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo, ledzeppelin, deeppurple, chitarra;//Immagine di sfondo e poster
    private final JButton frecciaSinistra, frecciaDestra;//Bottoni delle frecce

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroFrontaleSecondaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensioni
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Immagine chitarra
         */
        this.chitarra = new AcquisisciImmagine("/Immagini/Oggetti/Chitarra.png");//Creazione
        this.chitarra.setBounds(330, 380, 200, 271);//Posizione e dimensioni
        add(this.chitarra);//Aggiunta dell'immagine al frame

        /**
         * Immagine Led Zeppelin
         */
        this.ledzeppelin = new AcquisisciImmagine("/Immagini/Oggetti/LedZeppelin.png");//Creazione
        this.ledzeppelin.setBounds(250, 170, 250, 150);//Posizione e dimensioni
        add(this.ledzeppelin);//Aggiunta dell'immagine al frame

        /**
         * Immagine Deep Purple
         */
        this.deeppurple = new AcquisisciImmagine("/Immagini/Oggetti/PosterDeepPurple.png");//Creazione
        this.deeppurple.setBounds(550, 220, 200, 150);//Posizione e dimensioni
        add(this.deeppurple);//Aggiunta dell'immagine al frame

        /**
         * Bottone freccia sinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Posizione e dimensioni
        this.frecciaSinistra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimuove il bordo del bottone
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine del bottone
        this.frecciaSinistra.setVisible(true);//Visibilità
        //Listener
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende questo pannello invisibile
                Gioco.secondaStanza.getMuroSinistroSecondaStanza().setVisible(true);//Rende visibile un altro pannello
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
        this.frecciaDestra.setVisible(true);//Visibilità
        //Listener
        this.frecciaDestra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile questo pannello
                Gioco.secondaStanza.getMuroDestroSecondaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunta del bottone al pannello

        /**
         * Immagine dello sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensione
        add(this.sfondo);//Aggiunta dello sfondo al frame
    }
}
