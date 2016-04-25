package PrimaStanza;

import ClassiAusiliarie.AcquisisciImmagine;
import Main.Gioco;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro sinistro della prima
 * stanza.
 *
 * @author Mario
 */
public class MuroSinistroPrimaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine sfondo, pianta;//Immagini sfondo e pianta
    public static AcquisisciImmagine cassaforteAperta;//Immagine cassaforte aperta
    private final JButton frecciaSinistra, frecciaDestra;//Bottoni delle frecce
    public static JButton cassaforteChiusa, chiaveUscita, tessera;//Vari bottoni

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroSinistroPrimaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensioni
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Bottone chiave
         */
        this.chiaveUscita = new JButton();//Creazione
        this.chiaveUscita.setBounds(450, 385, 70, 28);//Posizione e dimensioni
        this.chiaveUscita.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/ChiaveUscita.png")));//Immagine
        this.chiaveUscita.setVisible(false);//Visibilità
        this.chiaveUscita.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.chiaveUscita.setBorder(null);//Rimuove il bordo
        add(this.chiaveUscita);//Aggiunge il bottone al pannello

        /**
         * Immagine cassaforteaperta
         */
        this.cassaforteAperta = new AcquisisciImmagine("/Immagini/Oggetti/CassaforteAperta.png");//Creazione
        this.cassaforteAperta.setBounds(380, 250, 192, 331);//Posizione e dimensioni
        this.cassaforteAperta.setVisible(false);//Visibilità
        add(this.cassaforteAperta);//Aggiunta dell'immagine al pannello

        /**
         * Bottone cassaforte chiusa
         */
        this.cassaforteChiusa = new JButton();//Creazione
        this.cassaforteChiusa.setBounds(380, 250, 193, 319);//Posizione e dimensioni
        this.cassaforteChiusa.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/CassaforteChiusa.png")));//Immagine
        this.cassaforteChiusa.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.cassaforteChiusa.setBorder(null);//Rimuove il bordo
        this.cassaforteChiusa.setVisible(true);//Visibilità
        add(this.cassaforteChiusa);//Aggiunta dell'immagine al pannello

        /**
         * Bottone tessera
         */
        this.tessera = new JButton();//Creazione
        this.tessera.setBounds(260, 490, 20, 13);//Posizione e dimensioni
        this.tessera.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/Tessera.png")));//Immagine
        this.tessera.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.tessera.setBorder(null);//Rimuove il bordo
        this.tessera.setVisible(true);//Visibilità 
        //Listener
        this.tessera.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                tessera.setVisible(false);//Rende il bottone invisibile 
            }
        });
        add(this.tessera);//Aggiunge il bottone al pannello

        /**
         * Immagine della pianta
         */
        this.pianta = new AcquisisciImmagine("/Immagini/Oggetti/Pianta.png");//Creazione
        this.pianta.setBounds(240, 390, 70, 151);//Posizione e dimensioni
        add(this.pianta);//Aggiunta dell'immagine al pannello

        /**
         * Bottone frecciaSinistra
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
                setVisible(false);//Rende questo pannelllo invisibile
                Gioco.primaStanza.getMuroPosteriorePrimaStanza().setVisible(true);//Rende visibile un altro pannello
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
                setVisible(false);//Rende questo pannello invisibile
                Gioco.primaStanza.getMuroFrontalePrimaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunta del bottone al pannello

        /**
         * Immagine di sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensione
        add(this.sfondo);//Aggiunta dell'immagine al pannello
    }
}
