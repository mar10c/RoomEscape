package GestioneStanze;

import SecondaStanza.MuroFrontaleSecondaStanza;
import SecondaStanza.MuroPosterioreSecondaStanza;
import SecondaStanza.MuroSinistroSecondaStanza;
import SecondaStanza.MuroDestroSecondaStanza;
import java.awt.Container;
import java.awt.Dimension;

/**
 * Questa classe estende un container sul quale vengono applicati i JPanel che
 * corrispondono alle varie pareti della seconda stanza.
 *
 * @author Mario
 */
public class SecondaStanza extends Container {

    /**
     * Variabili di istanza
     */
    private final MuroFrontaleSecondaStanza muroFrontaleSecondaStanza;//Istanza della classe del muro frontale
    private final MuroPosterioreSecondaStanza muroPosterioreSecondaStanza;//Istanza della classe del muro posteriore
    private final MuroDestroSecondaStanza muroDestroSecondaStanza;//Istanza della classe del muro destro
    private final MuroSinistroSecondaStanza muroSinistroSecondaStanza;//Istanza della classe del muro sinistro

    /**
     * Costruttore parametrico.
     *
     * @param pDimensione
     */
    public SecondaStanza(Dimension pDimensione) {

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
        this.muroFrontaleSecondaStanza = new MuroFrontaleSecondaStanza(pDimensione);
        this.muroPosterioreSecondaStanza = new MuroPosterioreSecondaStanza(pDimensione);
        this.muroDestroSecondaStanza = new MuroDestroSecondaStanza(pDimensione);
        this.muroSinistroSecondaStanza = new MuroSinistroSecondaStanza(pDimensione);

        /**
         * Aggiunta pannelli prima stanza al container
         */
        add(muroFrontaleSecondaStanza);
        add(muroPosterioreSecondaStanza);
        add(muroDestroSecondaStanza);
        add(muroSinistroSecondaStanza);
    }

    /* Metodi che restituiscono le istanze delle classi della seconda stanza */
    /**
     * Questo metodo restituisce l'istanza della classe
     * MuroFrontaleSecondaStanza.
     *
     * @return
     */
    public MuroFrontaleSecondaStanza getMuroFrontaleSecondaStanza() {
        return muroFrontaleSecondaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe
     * MuroPosterioreSecondaStanza.
     *
     * @return
     */
    public MuroPosterioreSecondaStanza getMuroPosterioreSecondaStanza() {
        return muroPosterioreSecondaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe MuroDestroSecondaStanza.
     *
     * @return
     */
    public MuroDestroSecondaStanza getMuroDestroSecondaStanza() {
        return muroDestroSecondaStanza;
    }

    /**
     * Questo metodo restituisce l'istanza della classe
     * MuroSinistroSecondaStanza.
     *
     * @return
     */
    public MuroSinistroSecondaStanza getMuroSinistroSecondaStanza() {
        return muroSinistroSecondaStanza;
    }
}
