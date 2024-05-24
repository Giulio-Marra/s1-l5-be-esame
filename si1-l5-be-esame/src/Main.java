import entities.ElementoRiproducibile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElementoRiproducibile elemento1 = new ElementoRiproducibile("giorgio", 3, true);

        elemento1.play();

        elemento1.abbassaVolume(true);
        elemento1.play();
    }
}