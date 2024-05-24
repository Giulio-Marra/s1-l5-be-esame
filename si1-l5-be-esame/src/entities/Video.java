package entities;

import interfaces.AbbassaLuminosita;
import interfaces.AlzaLuminosita;

public class Video extends ElementoRiproducibile implements AbbassaLuminosita, AlzaLuminosita {

    public int luminosita;

    public Video(String nome, double durata, boolean player) {
        super(nome, durata, player);
        this.luminosita = 3;
    }

    @Override
    public void abbassaLuminosità(boolean abbassa) {
        if (abbassa) {
            this.luminosita--;
        }
    }

    @Override
    public void alzaLuminosita(boolean alza) {
        if (alza) {
            this.luminosita++;
        }
    }

    @Override
    public void play() {
        if (player) {
            for (int i = 1; i <= this.durata; i++) {
                StringBuilder esclamativo = new StringBuilder();
                for (int j = 0; j < this.volume; j++) {
                    esclamativo.append("!");
                }
                StringBuilder asterisco = new StringBuilder();
                for (int y = 0; y < this.luminosita; y++) {
                    asterisco.append("*");
                }
                System.out.println(nome + " - VOLUME= " + esclamativo + " - LUMINOSITA= " + asterisco);
            }
        }
    }


}
