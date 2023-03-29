import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    static List<Libro> libreria = new ArrayList<>();
    boolean running = true;
    public static void main(String[] args){
        boolean running = true;
        while (running) {

            visualizzaMenu();
            int scelta = input.nextInt();

            switch (scelta) {
                case 1 -> aggiungiLibro();
//                case 2 -> cercaLibro();
//                case 3 -> modificaLibro();
//                case 4 -> cancellaLibro();
                case 0 -> running = spegnimento();
            }
        }
    }

    private static void visualizzaMenu() {
        System.out.println("Seleziona un'operazione:");
        System.out.println("1. Aggiungi libro");
        System.out.println("2. Cerca libro");
        System.out.println("3. Modifica libro");
        System.out.println("4. Cancella libro");
        System.out.println("0. Esci");
    }
    private static void aggiungiLibro() {
        Libro libro = new Libro();
        boolean runningAggLibro = true;

        System.out.println("Aggiungi il tuo libro");
        System.out.println("Digita il titolo");
        String titolo = input.next();
        libro.setTitolo(titolo);

        while (runningAggLibro) {
            System.out.println("Digita il genere:");
            System.out.println(Libro.tagDisponibili);
            String genere = input.next();
            boolean corrispondenza = false;
            for (String i : Libro.tagDisponibili) {
                if(i.equalsIgnoreCase(genere)) {
                    corrispondenza = true;
                    break;
                }
            }
            if(corrispondenza) {
                libro.setGenere(genere);
                System.out.println("Genere Aggiunto!");
                runningAggLibro = false;
            } else System.out.println("Genere non valido, riprova");
        }

        System.out.println("Digita il numero delle pagine");
        String numPagine = input.next();
        libro.setNumPagine(numPagine);

        runningAggLibro = true;
        while (runningAggLibro) {

            System.out.println("Hai letto/hai finito di leggere il libro? Sì/No");
            String sceltaStr = input.next();
            if(sceltaStr.equalsIgnoreCase("sì") || sceltaStr.equalsIgnoreCase("si")) {
                libro.setHaiLetto(true);
                runningAggLibro = false;
            } else if (sceltaStr.equalsIgnoreCase("no")) {
                System.out.println("A che pagina sei?");
                String pagina = input.next();
                libro.setSegnalibro(pagina);
                runningAggLibro = false;
            } else System.out.println("Errore nella risposta");
        }

        boolean primaIterazione = false;
        runningAggLibro = true;
        while (runningAggLibro) {
            if(primaIterazione) {
                System.out.println("Vuoi aggiungere altri tag al libro? Sì/No");
            } else {
                System.out.println("Vuoi aggiungere tag al libro? Sì/No");
                primaIterazione = true;
            }
            String sceltaStr = input.next();
            if(sceltaStr.equalsIgnoreCase("sì") || sceltaStr.equalsIgnoreCase("si")) {
                System.out.println(Libro.tagDisponibili);
                System.out.println("Seleziona un tag:");
                System.out.println(Libro.tagDisponibili);
                String tag = input.next();
                boolean corrispondenza = false;
                for (String i : Libro.tagDisponibili) {
                    if(i.equalsIgnoreCase(tag)) {
                        corrispondenza = true;
                        break;
                    }
                }
                if(corrispondenza) {
                    libro.setTagLibro(tag);
                    System.out.println("Tag Aggiunto!");
                } else System.out.println("Tag irregolare...");
            } else if (sceltaStr.equalsIgnoreCase("no")) {
                System.out.println("Va bene");
                runningAggLibro = false;
            } else System.out.println("Errore nella risposta");
        }

        runningAggLibro = true;
        while (runningAggLibro) {
            System.out.println("Vuoi aggiungere un riassunto al libro? Sì/No");
            String sceltaStr = input.next();
            if(sceltaStr.equalsIgnoreCase("sì") || sceltaStr.equalsIgnoreCase("si")) {
                String riassunto = input.next();
                libro.setRiassunto(riassunto);
                System.out.println("Riassunto aggiunto!");
                runningAggLibro = false;
            } else if (sceltaStr.equalsIgnoreCase("no")) {
            System.out.println("Va bene");
            runningAggLibro = false;
            } else System.out.println("Errore nella risposta");
        }

        runningAggLibro = true;
        while (runningAggLibro) {
            System.out.println("Vuoi aggiungere una recensione al libro? Sì/No");
            String sceltaStr = input.next();
            if(sceltaStr.equalsIgnoreCase("sì") || sceltaStr.equalsIgnoreCase("si")) {
                String recensione = input.next();
                libro.setRecensione(recensione);
                System.out.println("Recensione aggiunta!");
                runningAggLibro = false;
            } else if (sceltaStr.equalsIgnoreCase("no")) {
                System.out.println("Va bene");
                runningAggLibro = false;
            } else System.out.println("Errore nella risposta");
        }

        runningAggLibro = true;
        while (runningAggLibro) {
            System.out.println("Vuoi dare un voto al libro? Sì/No");
            String sceltaStr = input.next();
            if(sceltaStr.equalsIgnoreCase("sì") || sceltaStr.equalsIgnoreCase("si")) {
                String voto = input.next();
                if(Libro.votiDisponibili.contains(voto)) {
                    libro.setVoto(voto);
                    System.out.println("Voto aggiunto!");
                    runningAggLibro = false;
                }
            } else if (sceltaStr.equalsIgnoreCase("no")) {
                System.out.println("Va bene");
                runningAggLibro = false;
            } else System.out.println("Errore nella risposta");
        }

        libreria.add(libro);
        System.out.println("Libro aggiunto con successo!");
    }
    private static Boolean spegnimento() {
        System.out.println("Arrivederci!");
        return false;
    }
}
