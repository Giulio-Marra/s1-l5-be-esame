package entities;

import interfaces.AbbassaLuminosita;


public class Audio extends ElementoRiproducibile implements AbbassaLuminosita {

    public int volume;

    public Audio(String nome, double durata, boolean player, int volume) {
        super(nome, durata, player);
        this.volume = volume;
    }

    @Override
    public void play() {
        if (player) {
            for (int i = 1; i <= this.durata; i++) {
                StringBuilder esclamativo = new StringBuilder();
                for (int j = 0; j < this.volume; j++) {
                    esclamativo.append("!");
                }
                System.out.println(nome + " - VOLUME= " + esclamativo);
            }
        }
    }

    public void abbassaVolume(boolean abbassa) {
        if (abbassa) {
            this.volume--;
        }
    }

    public void alzaVolume(boolean alza) {
        if (alza) {
            this.volume++;
        }
    }

    @Override
    public String toString() {
        return "Audio [nome=" + nome + ", durata=" + durata + ", volume=" + volume + ", player=" + player + "]";
    }


}
