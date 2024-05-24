package entities;

public class ElementoRiproducibile extends ElementoMultimediale {

    public int volume;
    public double durata;
    public boolean player;

    public ElementoRiproducibile(String nome, double durata, boolean player) {
        super(nome);
        this.volume = 4;
        this.durata = durata;
        this.player = player;
    }

    public void play() {
        if (player) {
            for (int i = 1; i <= this.volume; i++) {
                String puntoEsclamativo = "!".repeat(i);
                System.out.println(nome + puntoEsclamativo);
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

}
