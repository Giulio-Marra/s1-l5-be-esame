package entities;

import java.util.Scanner;

public class MemorizzaElementi {

    public String[] arrayDiStringhe = new String[5];


    public void aggiungiElementi() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayDiStringhe.length; i++) {
            System.out.println("Inserisci un elemento: da 1 a 3 (1:immagine, 2:audio, 3:video)");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci un nome");
                    String nomeimmagine = scanner.nextLine();
                    System.out.println("inserisci la luminosità da 1 a 5");
                    int luminositaimmagine = scanner.nextInt();
                    scanner.nextLine();
                    arrayDiStringhe[i] = new Immagine(nomeimmagine, luminositaimmagine).toString();
                    break;
                case 2:
                    System.out.println("Inserisci un nome");
                    String nomeaudio = scanner.nextLine();
                    System.out.println("inserisci il volume da 1 a 5");
                    int volumeaudio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("inserisci la durata da 1 a 5");
                    double durataaudio = scanner.nextInt();
                    scanner.nextLine();
                    boolean playeraudio = true;
                    arrayDiStringhe[i] = new Audio(nomeaudio, durataaudio, playeraudio, volumeaudio).toString();
                    break;
                case 3:
                    System.out.println("Inserisci un nome");
                    String nomevideo = scanner.nextLine();
                    System.out.println("inserisci il volume da 1 a 5");
                    int volumevideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("inserisci la durata da 1 a 5");
                    double duratavideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("inserisci la luminosita da 1 a 5");
                    int luminositavideo = scanner.nextInt();
                    scanner.nextLine();
                    boolean playervideo = true;
                    arrayDiStringhe[i] = new Video(nomevideo, duratavideo, playervideo, volumevideo, luminositavideo).toString();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
        while (true) {
            System.out.println("Seleziona un numero da 1 a 5 Oppure 0 per uscire:");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Uscita...");
                    scanner.close();
                    break;
                case 1:
                    System.out.println("L'elemento alla posizione " + scelta + " è: " + arrayDiStringhe[scelta - 1]);
                    break;
                case 2:
                    System.out.println("L'elemento alla posizione " + scelta + " è: " + arrayDiStringhe[scelta - 1]);
                    break;
                case 3:
                    System.out.println("L'elemento alla posizione " + scelta + " è: " + arrayDiStringhe[scelta - 1]);
                    break;
                case 4:
                    System.out.println("L'elemento alla posizione " + scelta + " è: " + arrayDiStringhe[scelta - 1]);
                    break;
                case 5:
                    System.out.println("L'elemento alla posizione " + scelta + " è: " + arrayDiStringhe[scelta - 1]);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

    }
}
