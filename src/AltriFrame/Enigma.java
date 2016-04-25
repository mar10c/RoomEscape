package AltriFrame;

import ClassiAusiliarie.AcquisisciImmagine;
import GestioneImmagini.Resources;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Questa classe rappresenta il frame dove si trova l'enigma che, risolto,
 * permette di aprire la cassaforte insieme alla chiave.
 *
 * @author Mario
 */
public class Enigma extends JFrame {

    /**
     * Variabili di istanza
     */
    public static JButton rosso, giallo, verde, blu, apricassaforte;//Bottoni utilizzati 
    private final JButton arancione, magenta, ciano, bianco;//Bottoni distrattori
    private final AcquisisciImmagine sfondo;//Immagine di sfondo

    /**
     * Costruttore
     */
    public Enigma() {

        /**
         * Attrubuti del frame
         */
        this.setSize(800, 600);//Dimensioni 
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("Enigma Cassaforte");//Titolo
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setBackground(null);//Sfondo di default
        this.setLayout(null);//Layout di default
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Chiude il frame esenza terminare l'esecuzione del programma
        this.setResizable(false);//Non permette di ridimensionare il frame
        this.setVisible(true);//Visibilità

        /**
         * Bottone rosso
         */
        this.rosso = new JButton();//Creazione
        this.rosso.setBounds(25, 100, 150, 100);//Posizione e dimensioni
        this.rosso.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.rosso.setBorder(null);//Rimozione del bordo
        this.rosso.setBackground(Color.RED);//Colore dello sfondo
        this.rosso.setVisible(true);//Visibilità
        add(this.rosso);//Aggiunta del bottone al frame

        /**
         * Bottone magenta
         */
        this.magenta = new JButton();//Creazione
        this.magenta.setBounds(225, 100, 150, 100);//Posizione e dimensioni
        this.magenta.setContentAreaFilled(true);//Rimozione del contenuto colorato del bottone
        this.magenta.setBorder(null);//Rimozione del bordo del bottone
        this.magenta.setBackground(Color.MAGENTA);//Colore dello sfondo
        this.magenta.setVisible(true);//Visibilità
        add(this.magenta);//Aggiunta del bottone al frame

        /**
         * Bottone verde
         */
        this.verde = new JButton();//Creazione
        this.verde.setBounds(425, 100, 150, 100);//Posizione e dimensioni
        this.verde.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.verde.setBorder(null);//Rimozione del bordo
        this.verde.setBackground(Color.GREEN);//Colore dello sfondo
        this.verde.setVisible(true);//Visibilità
        add(this.verde);//Aggiunta del bottone al frame

        /**
         * Bottone bianco
         */
        this.bianco = new JButton();//Creazione 
        this.bianco.setBounds(625, 100, 150, 100);//Posizione e dimensioni
        this.bianco.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.bianco.setBorder(null);//Rimozione del bordo
        this.bianco.setBackground(Color.WHITE);//Colore dello sfondo
        this.bianco.setVisible(true);//Visibilità
        add(this.bianco);//Aggiunta del bottone al frame

        /**
         * Bottone arancione
         */
        this.arancione = new JButton();//Creazione
        this.arancione.setBounds(25, 350, 150, 100);//Posizione e dimensioni
        this.arancione.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.arancione.setBorder(null);//Rimozione del bordo
        this.arancione.setBackground(Color.ORANGE);//Colore dello sfondo
        this.arancione.setVisible(true);//Visibilità
        add(this.arancione);//Aggiunta del bottone al frame

        /**
         * Bottone ciano
         */
        this.ciano = new JButton();//Creazione
        this.ciano.setBounds(225, 350, 150, 100);//Posizione e dimensioni
        this.ciano.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.ciano.setBorder(null);//Rimozione del bordo
        this.ciano.setBackground(Color.CYAN);//Colore dello sfondo
        this.ciano.setVisible(true);//Visibilità
        add(this.ciano);//Aggiunta del bottone al frame

        /**
         * Bottone blu
         */
        this.blu = new JButton();//Creazione
        this.blu.setBounds(425, 350, 150, 100);//Posizione e dimensioni
        this.blu.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.blu.setBorder(null);//Rimozione del bordo
        this.blu.setBackground(Color.BLUE);//Colore dello sfondo
        this.blu.setVisible(true);//Visibilità
        add(this.blu);//Aggiunta del bottone al frame

        /**
         * Bottone verde
         */
        this.giallo = new JButton();//Creazione
        this.giallo.setBounds(625, 350, 150, 100);//Posizione e dimensioni
        this.giallo.setContentAreaFilled(true);//Rimozione del contenuto colorato
        this.giallo.setBorder(null);//Rimozione del bordo
        this.giallo.setBackground(Color.YELLOW);//Colore dello sfondo
        this.giallo.setVisible(true);//Visibilità
        add(this.giallo);//Aggiunta del bottone al frame

        /**
         * Bottone apricassaforte
         */
        this.apricassaforte = new JButton();//Creazione del bottone
        this.apricassaforte.setBounds(300, 500, 200, 50);//Posizione e dimensione del bottone
        this.apricassaforte.setText("APRI LA CASSAFORTE");//Aggiunta del testo al bottone 
        this.apricassaforte.setContentAreaFilled(true);//Rimozione del contenuto colorato del bottone
        this.apricassaforte.setBorder(null);//Rimozione del bordo del bottone
        this.apricassaforte.setForeground(Color.BLUE);//Colore del testo
        this.apricassaforte.setBackground(null);//Colore di sfondo
        this.apricassaforte.setVisible(false);//Rende visibile il bottone
        add(this.apricassaforte);//Aggiunta del bottone al frame

        /**
         * Immagine di sfondo
         */
        this.sfondo = new AcquisisciImmagine("/Immagini/Grigio.png");//Creazione
        this.sfondo.setLocation(0, 0);//Posizione
        this.sfondo.setSize(800, 600);//Dimensioni
        add(this.sfondo);//Aggiunta dell'immagine al frame
    }
}
