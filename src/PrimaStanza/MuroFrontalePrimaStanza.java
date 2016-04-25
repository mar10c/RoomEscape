package PrimaStanza;

import ClassiAusiliarie.*;
import Main.Gioco;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro frontale della prima
 * stanza.
 *
 * @author Mario
 */
public class MuroFrontalePrimaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo, orologio;//Immagini sfondo e orologio
    private final JButton frecciaSinistra, frecciaDestra;//Bottoni delle freccie
    public static JButton portaMuroFrontalePrimaStanza;//Bottone porta

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroFrontalePrimaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensioni
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Bottone portaMuroFrontalePrimaStanza
         */
        this.portaMuroFrontalePrimaStanza = new JButton();//Creazione
        this.portaMuroFrontalePrimaStanza.setBounds(385, 255, 162, 300);//Posizione e dimensioni
        this.portaMuroFrontalePrimaStanza.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaChiusa.png")));//Immagine
        this.portaMuroFrontalePrimaStanza.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.portaMuroFrontalePrimaStanza.setBorder(null);//Rimuove il bordo
        this.portaMuroFrontalePrimaStanza.setVisible(true);//Visibilità
        add(this.portaMuroFrontalePrimaStanza);//Aggiunta al pannello

        /**
         * Immagine dell'orologio
         */
        this.orologio = new AcquisisciImmagine("/Immagini/Oggetti/BinaryClock.png");//Creazione
        this.orologio.setBounds(200, 150, 100, 100);//Posizione e dimensioni
        add(this.orologio);//Aggiunta dell immagine al frame

        /**
         * Bottone freccia sinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Posizione e dimensioni
        this.frecciaSinistra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimuove il bordo
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.frecciaSinistra.setVisible(true);//Visibilità
        //Listener
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile questo pannello
                Gioco.primaStanza.getMuroSinistroPrimaStanza().setVisible(true);//Rende visibile una altro pannello
            }
        });
        add(this.frecciaSinistra);//Aggiunge il bottone al pannello

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
                setVisible(false);//Rende questo pannello invisibile
                Gioco.primaStanza.getMuroDestroPrimaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunta del bottone al frame

        /**
         * Acquisizione dello sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensione
        add(this.sfondo);//Aggiunta dell'immagine al frame
    }

}
