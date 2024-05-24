import entities.Audio;
import entities.Immagine;
import entities.MemorizzaElementi;
import entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("VIDEO", 3, true, 3, 3);
        Audio audio1 = new Audio("AUDIO", 2, true, 3);
        Immagine immagine1 = new Immagine("IMMAGINE", 3);

        System.out.println("--------------------VIDEO BASE-------------------------");
        video1.play();

        System.out.println("--------------------VIDEO DOPO AVER CAMBIATO IL VOLUME-------------------------");
        video1.abbassaVolume(true);
        video1.play();

        System.out.println("--------------------VIDEO DOPO AVER CAMBIATO IL VOLUME E LUMINOSITA-------------------------");
        video1.alzaVolume(true);
        video1.alzaVolume(true);
        video1.abbassaLuminosità(true);
        video1.play();

        System.out.println("--------------------AUDIO BASE-------------------------");
        audio1.play();

        System.out.println("--------------------AUDIO DOPO AVER CAMBIATO VOLUME-------------------------");
        audio1.alzaVolume(true);
        audio1.play();

        System.out.println("--------------------IMMAGINE BASE-------------------------");
        immagine1.show();

        System.out.println("--------------------IMMAGINE DOPO AVER CAMBIATO LUMINOSITA-------------------------");
        immagine1.abbassaLuminosità(true);
        immagine1.show();

        System.out.println("--------------------CREAZIONE ARRAY-------------------------");
        MemorizzaElementi primoelemento = new MemorizzaElementi();
        primoelemento.aggiungiElementi();


    }
}