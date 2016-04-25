package ClassiAusiliarie;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import GestioneImmagini.Resources;

/**
 * Questa classe prende in input il percorso dell'immagine e la disegna tramite
 * il metodo paint. Il percorso dell'immagine viene elaborato dal metodo
 * getImage della classe Resources. (Classe ripresa da quella originale di
 * Roberto Scinocca).
 *
 * @author Mario
 */
public class AcquisisciImmagine extends JPanel {

    /**
     * Variabili di istanza
     */
    private final BufferedImage immagine;

    /**
     * Costruttore parametrico.
     *
     * @param path
     */
    public AcquisisciImmagine(String path) {

        this.setBounds(0, 0, 933, 700);//Posizione e dimensioni
        this.immagine = Resources.getImage(path);//Acquisizione del path dell'immagine
    }

    @Override
    public void paint(Graphics grphcs) {
        grphcs.drawImage(this.immagine, 0, 0, this);//Si disegna l'immagine
    }

}
