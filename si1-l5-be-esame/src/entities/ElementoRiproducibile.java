package entities;

public class ElementoRiproducibile extends ElementoMultimediale {

    public int volume;
    public int durata;
    public boolean player;

    public ElementoRiproducibile(String nome, int volume, int durata, boolean player) {
        super(nome);
        this.volume = 4;
        this.durata = durata;
        this.player = true;
    }

    public void play() {
        if (player) {
            for (int i = 0; i < this.volume; i++) {
                String puntoEsclamativo = "!".repeat(i);
                System.out.println(nome + puntoEsclamativo);
            }
        }
    }


    public void abbassaVolume() {
        
    }

    public void alzaVolume() {

    }

}
