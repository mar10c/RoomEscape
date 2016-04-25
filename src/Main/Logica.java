package Main;

import AltriFrame.Enigma;
import AltriFrame.Vittoria;
import static Main.Gioco.primaStanza;
import static Main.Gioco.secondaStanza;
import PrimaStanza.MuroFrontalePrimaStanza;
import PrimaStanza.MuroPosteriorePrimaStanza;
import PrimaStanza.MuroSinistroPrimaStanza;
import SecondaStanza.MuroSinistroSecondaStanza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 * Questa classe gestisce la logica del gioco.
 *
 * @author Mario
 */
public class Logica {

    /**
     * Variabili di istanza
     */
    public Enigma enigma;//Istanza della classe Enigma
    public Vittoria vittoria;//Istanza della classe Vittoria

    /**
     * Costruttore
     */
    public Logica() {

        //Listener della chiave per la prima porta
        MuroPosteriorePrimaStanza.chiavePrimaPorta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                MuroPosteriorePrimaStanza.chiavePrimaPorta.setVisible(false);//Scompare la chiave

                //Listener della porta della prima stanza
                MuroFrontalePrimaStanza.portaMuroFrontalePrimaStanza.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        MuroFrontalePrimaStanza.portaMuroFrontalePrimaStanza.setPressedIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaAperta.png")));//Immagine alla pressione del bottone
                        primaStanza.getMuroFrontalePrimaStanza().setVisible(false);//Muro frontale prima stanza invisibile
                        primaStanza.setVisible(false);//Prima stanza invisibile
                        secondaStanza.setVisible(true);//Seconda stanza invisibile
                        secondaStanza.getMuroFrontaleSecondaStanza().setVisible(true);//Muro frontale seconda stanza visibile
                    }
                });
            }
        });

        //Lstener della tessera
        MuroSinistroPrimaStanza.tessera.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                MuroSinistroPrimaStanza.tessera.setVisible(false);//Scompare la tessera

                //Listener lettoretessera
                MuroSinistroSecondaStanza.lettoretessera.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        MuroSinistroSecondaStanza.quadro.setBounds(410, 170, 300, 200);//Spostamento quadro
                        MuroSinistroSecondaStanza.nicchia.setVisible(true);//Nicchia visibile
                        MuroSinistroSecondaStanza.chiaveCassaforte.setVisible(true);//Chiave cassaforte visibile                        

                        //Listener chiave cassaforte
                        MuroSinistroSecondaStanza.chiaveCassaforte.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                MuroSinistroSecondaStanza.chiaveCassaforte.setVisible(false);//Chiave cassaforte invisibile

                                //Listener cassaforte chiusa
                                MuroSinistroPrimaStanza.cassaforteChiusa.addActionListener(new ActionListener() {

                                    @Override
                                    public void actionPerformed(ActionEvent ae) {
                                        enigma = new Enigma();//Si richiama la classe enigma

                                        //Listener bottone rosso
                                        Enigma.rosso.addActionListener(new ActionListener() {

                                            @Override
                                            public void actionPerformed(ActionEvent ae) {

                                                //Listener bottone giallo
                                                Enigma.giallo.addActionListener(new ActionListener() {

                                                    @Override
                                                    public void actionPerformed(ActionEvent ae) {

                                                        //Listener bottone blu
                                                        Enigma.blu.addActionListener(new ActionListener() {

                                                            @Override
                                                            public void actionPerformed(ActionEvent ae) {

                                                                //Listener bottone verde
                                                                Enigma.verde.addActionListener(new ActionListener() {

                                                                    @Override
                                                                    public void actionPerformed(ActionEvent ae) {

                                                                        Enigma.apricassaforte.setVisible(true);//Bottone visibile

                                                                        //Listener del bottone
                                                                        Enigma.apricassaforte.addActionListener(new ActionListener() {

                                                                            @Override
                                                                            public void actionPerformed(ActionEvent ae) {
                                                                                enigma.setVisible(false);//Frame invisibile
                                                                                MuroSinistroPrimaStanza.cassaforteChiusa.setVisible(false);//Cassaforte chiusa invisibile
                                                                                MuroSinistroPrimaStanza.cassaforteAperta.setVisible(true);//Cassaforte aperta visibile
                                                                                MuroSinistroPrimaStanza.chiaveUscita.setVisible(true);//Chiave uscita visibile

                                                                                //Listener chiaveuscita
                                                                                MuroSinistroPrimaStanza.chiaveUscita.addActionListener(new ActionListener() {

                                                                                    @Override
                                                                                    public void actionPerformed(ActionEvent ae) {
                                                                                        MuroSinistroPrimaStanza.chiaveUscita.setVisible(false);//Chiave uscita invisibile

                                                                                        //Listener porta uscita dal gioco 
                                                                                        MuroPosteriorePrimaStanza.portaUscitaDalGioco.addActionListener(new ActionListener() {

                                                                                            @Override
                                                                                            public void actionPerformed(ActionEvent ae) {
                                                                                                MuroPosteriorePrimaStanza.portaUscitaDalGioco.setPressedIcon(new ImageIcon(getClass().getResource("/Immagini/Oggetti/PortaAperta.png")));//Immagine alla pressione del bottone
                                                                                                vittoria = new Vittoria();//Si richiama il frame Vittoria
                                                                                            }
                                                                                        });
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}
