package SecondaStanza;

import ClassiAusiliarie.AcquisisciImmagine;
import Main.Gioco;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro sinistro della seconda
 * stanza.
 *
 * @author Mario
 */
public class MuroSinistroSecondaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final JButton frecciaSinistra, frecciaDestra;//Bottoni frecce
    public static JButton quadro, chiaveCassaforte, lettoretessera;//Bottoni 
    public static AcquisisciImmagine nicchia;//Immagine della nicchia
    private final AcquisisciImmagine sfondo;//Immagine di sfondo

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroSinistroSecondaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensione
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Visibilità

        /**
         * Bottone Chiave
         */
        this.chiaveCassaforte = new JButton();//Creazione
        this.chiaveCassaforte.setBounds(250, 200, 300, 200);//Posizione e dimensioni
        this.chiaveCassaforte.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/ChiaveCassaforte.png")));//Immagine
        this.chiaveCassaforte.setVisible(true);//Visibilità
        this.chiaveCassaforte.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.chiaveCassaforte.setBorder(null);//Rimuove il bordo
        this.chiaveCassaforte.setVisible(false);//Visibilità
        add(this.chiaveCassaforte);//Aggiunta del bottone al pannello

        /**
         * Bottone lettoretessera
         */
        this.lettoretessera = new JButton();//Creazione
        this.lettoretessera.setBounds(230, 210, 31, 84);//Posizione e dimensioni
        this.lettoretessera.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/LettoreDiTessere.png")));//Immagine
        this.lettoretessera.setVisible(true);//Visibilità
        this.lettoretessera.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.lettoretessera.setBorder(null);//Rimuove il bordo 
        this.lettoretessera.setVisible(true);//Visibilità
        add(this.lettoretessera);//Aggiunta del bottone al pannello

        /**
         * Bottone quadro
         */
        this.quadro = new JButton();//Creazione
        this.quadro.setBounds(250, 170, 300, 200);//Posizione e dimensioni
        this.quadro.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/QuadroChiuso.png")));//Immagine
        this.quadro.setVisible(true);//Visibilità
        this.quadro.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.quadro.setBorder(null);//Rimuove il bordo
        this.quadro.setVisible(true);//Visibilità
        add(this.quadro);//Aggiunge il bottone al pannello

        /**
         * Immagine nicchia
         */
        this.nicchia = new AcquisisciImmagine("/Immagini/Oggetti/Nicchia.png");//Creazione
        this.nicchia.setBounds(300, 210, 300, 200);//Posizione e dimensioni
        this.nicchia.setVisible(false);//Visibilità
        add(this.nicchia);//Aggiunta dell'immagine al pannello

        /**
         * Bottone frecciaSinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Posizione e dimensioni
        this.frecciaSinistra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimuove il bordo
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.frecciaSinistra.setVisible(true);
        //Listener
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende questo pannello invisibile
                Gioco.secondaStanza.getMuroPosterioreSecondaStanza().setVisible(true);//Rende visibile un altro pannello
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
        this.frecciaDestra.setVisible(true);
        //Listener
        this.frecciaDestra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende questo pannello invisibile
                Gioco.secondaStanza.getMuroFrontaleSecondaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaDestra);//Aggiunta del bottone al pannello

        /**
         * Immagine sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(pDimensione);//Dimensione
        add(this.sfondo);//Aggiunta dll'immagine al pannello
    }
}
