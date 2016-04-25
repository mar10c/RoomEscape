package GestioneStanze;

import PrimaStanza.MuroFrontalePrimaStanza;
import PrimaStanza.MuroPosteriorePrimaStanza;
import PrimaStanza.MuroSinistroPrimaStanza;
import PrimaStanza.MuroDestroPrimaStanza;
import java.awt.Container;
import java.awt.Dimension;

/**
 * Questa classe estende un container sul quale vengono applicati i JPanel che
 * corrispondono alle varie pareti della prima stanza.
 *
 * @author Mario
 */
public class PrimaStanza extends Container {

    /**
     * Variabili di istanza
     */
    private final MuroDestroPrimaStanza muroDestroPrimaStanza;//Istanza della classe del muro destro
    private final MuroFrontalePrimaStanza muroFrontalePrimaStanza;//Istanza della classe del muro frontale
    private final MuroPosteriorePrimaStanza muroPosteriorePrimaStanza;//Istanza della classe del muro posteriore
    private final MuroSinistroPrimaStanza muroSinistroPrimaStanza;//Istanza della classe del muro sinistro

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public PrimaStanza(Dimension pDimensione) {

        /**
         * Attributi del container
         */
        this.setLocation(0, 0);//Posizione
        this.setSize(pDimensione);//Dimensioni
        this.setLayout(null);//Layout di default
        this.setBackground(null);//Sfondo di default

        /**
         * Inizializzazione pannelli prima stanza
         */
        this.muroDestroPrimaStanza = new MuroDestroPrimaStanza(pDimensione);
        this.muroFrontalePrimaStanza = new MuroFrontalePrimaStanza(pDimensione);
        this.muroPosteriorePrimaStanza = new MuroPosteriorePrimaStanza(pDimensione);
        this.muroSinistroPrimaStanza = new MuroSinistroPrimaStanza(pDimensione);

        /**
         * Aggiunta pannelli prima stanza al container
         */
        add(muroDestroPrimaStanza);
        add(muroFrontalePrimaStanza);
        add(muroPosteriorePrimaStanza);
        add(muroSinistroPrimaStanza);
    }

    /* Metodi che restituiscono le istanze delle classi della prima stanza */
    /**
     * Questo metodo restituisce l'istanza della classe MuroDestroPrimaStanza
     *
     * @return
     */
    public MuroDestroPrimaStanza getMuroDestroPrimaStanza() {
        return muroDestroPrimaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe MuroFrontalePrimaStanza
     *
     * @return
     */
    public MuroFrontalePrimaStanza getMuroFrontalePrimaStanza() {
        return muroFrontalePrimaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe
     * MuroPosteriorePrimaStanza
     *
     * @return
     */
    public MuroPosteriorePrimaStanza getMuroPosteriorePrimaStanza() {
        return muroPosteriorePrimaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe MuroSinistroPrimaStanza
     *
     * @return
     */
    public MuroSinistroPrimaStanza getMuroSinistroPrimaStanza() {
        return muroSinistroPrimaStanza;
    }
}
