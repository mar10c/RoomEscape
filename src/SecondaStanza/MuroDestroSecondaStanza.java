package SecondaStanza;

import ClassiAusiliarie.*;
import Main.Gioco;
import AltriFrame.LinuxMint;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Questa classe è un pannello che rappresenta il muro destro della seconda
 * stanza.
 *
 * @author Mario
 */
public class MuroDestroSecondaStanza extends JPanel {

    /**
     * Variabili di istanza
     */
    private final AcquisisciImmagine muro, scrivaniaConMac;
    private final JButton frecciaSinistra, frecciaDestra, schermo;
    private LinuxMint linux;

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public MuroDestroSecondaStanza(Dimension pDimensione) {

        /**
         * Attributi del pannello
         */
        this.setBackground(null);//Sfondo di default
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensione
        this.setLayout(null);//Layout di default
        this.setVisible(false);//Rende il pannello invisibile

        /**
         * Bottone schermo
         */
        this.schermo = new JButton();//Creazione
        this.schermo.setBounds(365, 280, 198, 105);//Posizione e dimensioni
        this.schermo.setContentAreaFilled(false);//Rimozione contenuto colorato
        this.schermo.setBorder(null);//Rimozione bordo
        this.schermo.setVisible(true);//Visibilità
        //Listener
        this.schermo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String password = JOptionPane.showInputDialog("Inserisci la password per accedere al computer");//Inserimento password
                if (password.equals("3581")) {//Confronto tra password immessa e stringa di confronto
                    linux = new LinuxMint();//Si richiama la classe LinuxMint
                } else {
                    JOptionPane.showMessageDialog(null, "Password non corretta!");//Messagio che appare in caso di password non corretta
                }
            }
        });
        add(this.schermo);//Aggiunta al pannello

        /**
         * Immagine scrivania con mac
         */
        this.scrivaniaConMac = new AcquisisciImmagine("/Immagini/Oggetti/ScrivaniaConMac.png");//Creazione
        this.scrivaniaConMac.setBounds(315, 280, 304, 291);//Posizione e dimensione
        add(this.scrivaniaConMac);//Aggiunta al pannello

        /**
         * Bottone freccia sinistra
         */
        this.frecciaSinistra = new JButton();//Creazione
        this.frecciaSinistra.setBounds(5, 485, 56, 62);//Creazione
        this.frecciaSinistra.setContentAreaFilled(false);//Rimuove il contenuto colorato
        this.frecciaSinistra.setBorder(null);//Rimuove il bordo
        this.frecciaSinistra.setIcon(new ImageIcon(getClass().getResource("/Immagini/FrecciaSinistra.png")));//Immagine
        this.frecciaSinistra.setVisible(true);//Visibilità
        //Listener
        this.frecciaSinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende questo pannello invisibile
                Gioco.secondaStanza.getMuroFrontaleSecondaStanza().setVisible(true);//Rende visibile un altro pannello
            }
        });
        add(this.frecciaSinistra);//Aggiunta del bottone al frame

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
                setVisible(false);//Visibilità
                Gioco.secondaStanza.getMuroPosterioreSecondaStanza().setVisible(true);//Rende un altro pannello visibile
            }
        });
        add(this.frecciaDestra);//Aggiunge il bottone al frame

        /**
         * Acquisizione imagine del muro
         */
        this.muro = new AcquisisciImmagine("/Immagini/Muro.png");//Creazione
        this.muro.setLocation(0, 0);//Posizione
        this.muro.setSize(pDimensione);//Dimensione
        add(this.muro);//Aggiunta dell'immagine al frame
    }
}
