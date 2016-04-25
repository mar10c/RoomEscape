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
 * Questa classe è un pannello che rappresenta il muro destro della prima
 * stanza.
 *
 * @author Mario
 */
public class MuroDestroPrimaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine scaffale, sfondo;//Immagini sfondo e scaffale
    private final JButton notepad, frecciaSinistra, frecciaDestra;//Bottoni frecce destra e sinistra

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroDestroPrimaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimenisioni
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Bottone blocconote
         */
        this.notepad = new JButton();//Creazione
        this.notepad.setBounds(430, 345, 71, 75);//Posizione e dimensioni
        this.notepad.setContentAreaFilled(false);//Rimozione del colore
        this.notepad.setBorder(null);//Rimozione del bordo
        this.notepad.setIcon(new ImageIcon(GestioneImmagini.Resources.getImage("/Immagini/Oggetti/NotepadCombinazione.png")));//Immagine
        this.notepad.setVisible(true);//Visibilità
        //Listner del notepad
        this.notepad.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                notepad.setVisible(false);//Se cliccato viene reso invisibile
            }
        });
        add(this.notepad);//Aggiunta al pannello

        /**
         * Immagine scaffale
         */
        this.scaffale = new AcquisisciImmagine("/Immagini/Oggetti/Scaffale.png");//Creazione
        this.scaffale.setBounds(230, 220, 500, 369);//Posizione e dimensioni
        add(this.scaffale);//Aggiunta al panello

        /**
         * Bottone freccia sinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Posizione e dimensioni
        this.frecciaSinistra.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimozione del bordo
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.frecciaSinistra.setVisible(true);//Visibilità
        //Listener del bottone
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile il pannello attuale
                Gioco.primaStanza.getMuroFrontalePrimaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaSinistra);

        /**
         * Bottone freccia destra
         */
        this.frecciaDestra = new JButton();//Creazione
        this.frecciaDestra.setBounds(865, 485, 56, 62);//Posizione e dimensioni
        this.frecciaDestra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaDestra.setBorder(null);//Rimuove il bordo del bottone
        this.frecciaDestra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaDestra.png")));//Immagine
        //Listener
        this.frecciaDestra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile il pannello attuale
                Gioco.primaStanza.getMuroPosteriorePrimaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunge il bottone al pannello

        /**
         * Immagine sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensioni
        add(this.sfondo);//Aggiunta dello sfondo al pannello

    }

}
