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
public class MuroPosteriorePrimaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo, portaOmbrelli, attaccapanni, finestra;//Immagini varie
    private final JButton frecciaSinistra, frecciaDestra;//Bottoni delle frecce
    public static JButton portaUscitaDalGioco, chiavePrimaPorta;//Bottoni della porta e della chiave
    public Gioco gioco;

    /**
     * Costruttore parametrico.
     *
     * @param psize
     */
    public MuroPosteriorePrimaStanza(Dimension psize) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(psize);//Dimensioni
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità 

        /**
         * Bottone chiave prima porta
         */
        this.chiavePrimaPorta = new JButton();//Creazione
        this.chiavePrimaPorta.setBounds(290, 505, 42, 38);//Posizione e dimensioni
        this.chiavePrimaPorta.setBorder(null);//Rimozione del bordo
        this.chiavePrimaPorta.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/ChiavePrimaPorta.png")));//Immagine
        this.chiavePrimaPorta.setVisible(true);//Visibilità
        this.chiavePrimaPorta.setContentAreaFilled(false);//Rimuove il contenuto colorato
        add(this.chiavePrimaPorta);//Aggiunta al frame della chiave

        /**
         * Immagine portaombrelli
         */
        this.portaOmbrelli = new AcquisisciImmagine("/Immagini/Oggetti/PortaOmbrelli.png");
        this.portaOmbrelli.setBounds(260, 410, 130, 130);
        add(this.portaOmbrelli);

        /**
         * Immagine attaccapanni
         */
        this.attaccapanni = new AcquisisciImmagine("/Immagini/Oggetti/Attaccapanni.png");
        this.attaccapanni.setBounds(190, 290, 200, 300);
        add(this.attaccapanni);

        /**
         * Immagine finestra interna
         */
        this.finestra = new AcquisisciImmagine("/Immagini/Oggetti/Finestra.png");
        this.finestra.setBounds(630, 255, 150, 178);
        add(this.finestra);

        /**
         * Bottone portauscita
         */
        this.portaUscitaDalGioco = new JButton();//Creazione
        this.portaUscitaDalGioco.setBounds(385, 255, 162, 300);//Posizione e dimensioni
        this.portaUscitaDalGioco.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaChiusa.png")));//Immagine del bottone
        this.portaUscitaDalGioco.setContentAreaFilled(false);//Rimuove il contenuto colorato del bottone
        this.portaUscitaDalGioco.setBorder(null);//Rimuove il bordo del bottone
        this.portaUscitaDalGioco.setVisible(true);//Rende il bottone visibile
        add(this.portaUscitaDalGioco);//Aggiunge il bottone al pannello

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
                Gioco.primaStanza.getMuroDestroPrimaStanza().setVisible(true);//Rende visibile un altro pannello
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
                setVisible(false);//Rende questo pannello invisibile
                Gioco.primaStanza.getMuroSinistroPrimaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);

        /**
         * Immagine di sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(psize);//Dimensione
        add(this.sfondo);//Aggiunta dello sfondo al pannello
    }

}
