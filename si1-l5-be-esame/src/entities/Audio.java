package entities;

import interfaces.AbbassaLuminosita;

public class Audio extends ElementoRiproducibile implements AbbassaLuminosita {
    public Audio(String nome, double durata, boolean player) {
        super(nome, durata, player);
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


}
