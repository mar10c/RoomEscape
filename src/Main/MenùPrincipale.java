package Main;

import AltriFrame.Extra;
import AltriFrame.Informazioni;
import ClassiAusiliarie.AcquisisciImmagine;
import GestioneImmagini.Resources;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Questa classe corrisponde al frame che viene visualizzato all'avvio del
 * programma e rappresenta il menù iniziale del gioco. Su questo menù si può
 * scegliere se iniziare il gioco oppure se visualizzare le informazioni e gli
 * extra.
 *
 * @author Mario
 */
public class MenùPrincipale extends JFrame {

    /**
     * Variabili di istanza
     */
    private Informazioni info;//Istanza della classe informazione
    private Extra extra;//Istanza della classe extra
    public Gioco gioco;//Istanza della classe gioco
    private final JButton portaIniziale, bottoneextra, informazioni;//Bottoni presenti sul frame
    private final AcquisisciImmagine sfondoMenùprincipale;//Immagine di sfondo del frame

    /**
     * Costruttore della classe MenùPrincipale
     */
    public MenùPrincipale() {

        this.gioco = new Gioco();//Si richiama il costruttore della classe Gioco

        /**
         * Attributi del frame
         */
        this.setSize(Gioco.dimensione);//Dimensioni  
        this.setLocationRelativeTo(null);//Posizione
        this.setTitle("Room Escape");//Titolo 
        this.setIconImage(Resources.getImage("/Immagini/Icona.png"));//Icona
        this.setBackground(null);//Sfondo di default
        this.setLayout(null);//Layout di default
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Chiude il frame e termina l'esecuzione
        this.setResizable(false);//Non permette di ridimensionare il frame

        /**
         * Bottone informazioni
         */
        this.informazioni = new JButton();//Creazione
        this.informazioni.setBounds(150, 310, 130, 168);//Posizione e dimensioni
        this.informazioni.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/FinestraEsterna.png")));//Immagine
        this.informazioni.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.informazioni.setBorder(null);//Rimozione del bordo
        this.informazioni.setVisible(true);//Visibilità
        //Listener del bottone
        this.informazioni.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                info = new Informazioni();//Si richiama il frame informazioni
            }
        });
        add(this.informazioni);//Aggiunta del bottone al frame

        /**
         * Bottone extra
         */
        this.bottoneextra = new JButton();//Creazione
        this.bottoneextra.setBounds(600, 360, 75, 130);//Posizione e dimensioni
        this.bottoneextra.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/CassettaPosta.png")));//Immagine
        this.bottoneextra.setContentAreaFilled(false);//Rimozione del contenuto colorato
        this.bottoneextra.setBorder(null);//Rimozione del bordo
        this.bottoneextra.setVisible(true);//Rende il bottone visibile
        //Listener del bottone
        this.bottoneextra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String password = JOptionPane.showInputDialog("Inserisci la password per ottenere la soluzione del gioco");//Inserimento password
                if (password.equals("1968")) {//Confronto tra password immessa e stringa di confronto
                    extra = new Extra();//Si richiama la classe extra
                } else {
                    JOptionPane.showMessageDialog(null, "Password non corretta!");//Messaggio che appare in caso di password non corretta
                }
            }
        });
        add(this.bottoneextra);//Aggiunta del bottone al frame

        /**
         * Bottone portainiziale
         */
        this.portaIniziale = new JButton();//Creazione
        this.portaIniziale.setBounds(385, 308, 162, 300);//Posizione e dimensioni
        this.portaIniziale.setIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaChiusa.png")));//Immagine iniziale
        this.portaIniziale.setPressedIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaAperta.png")));//Immagine alla pressione del bottone
        this.portaIniziale.setContentAreaFilled(false);//Rimozione del contenuto colorato 
        this.portaIniziale.setBorder(null);//Rimozione del bordo 
        this.portaIniziale.setVisible(true);//Visibilità
        //Listener del bottone
        this.portaIniziale.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);//Rende invisibile il frame MenùPrincipale
                gioco.setVisible(true);//Rende visibile il frame Gioco
                Gioco.primaStanza.getMuroFrontalePrimaStanza().setVisible(true);//Rende visibile il pannello MuroFrontalePrimaStanza sul frame Gioco
            }
        });
        add(this.portaIniziale);//Aggiunta del bottone al frame

        /**
         * Sfondo del frame
         */
        this.sfondoMenùprincipale = new AcquisisciImmagine("/Immagini/MenùPrincipale.png");//Creazione
        add(sfondoMenùprincipale);//Aggiunta dell'immagine al frame      
        this.dispose();//Carica l'immagine più velocemente sul frame (l'immagine utilizzata è troppo grande in termini di occupazione di memoria)
        this.setVisible(true);//Rende il frame visibile (parametro impostato in questa parte del codice perchè è presente il metodo dispose())
    }

}
