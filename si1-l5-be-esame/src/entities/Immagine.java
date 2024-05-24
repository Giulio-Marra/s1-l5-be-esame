package entities;

import interfaces.AbbassaLuminosita;
import interfaces.AlzaLuminosita;

public class Immagine extends ElementoMultimediale implements AbbassaLuminosita, AlzaLuminosita {

    public int luminosita;

    public Immagine(String nome) {
        super(nome);
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

    public void show() {
        for (int i = 1; i <= this.luminosita; i++) {
            String asterisco = "*".repeat(i);
            System.out.println(nome + " - LUMINOSITA= " + asterisco);
        }
    }
}
