import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libro{
    private String titolo = null;
    private String genere = null;
    private String numPagine = null;
    private String segnalibro = null;
    private Boolean haiLetto = null;
    private List<String> tagLibro = new ArrayList<>();
    public static final List<String> tagDisponibili = new ArrayList<>(Arrays.asList
            ("Ambiente e Animali",
            "Architettura Design e Moda",
            "Arte Beni culturali e Fotografia",
            "Bambini e Ragazzi",
            "Cinema e Spettacolo",
            "Economia Diritto e Lavoro",
            "Esoterismo e Astrologia",
            "Famiglia Scuola e Università",
            "Fantasy Horror e Gothic",
            "Fumetti",
            "Gastronomia",
            "Gialli Noir e Avventura",
            "Guide turistiche e Viaggi",
            "Hobby e Tempo libero",
            "Informatica e Web",
            "Lingue e Dizionari",
            "Musica",
            "Passione e Sentimenti",
            "Politica e Società",
            "Psicologia e Filosofia",
            "Religioni e Spiritualità",
            "Romanzi e Letterature",
            "Salute Benessere Self Help",
            "Scienza e Tecnica",
            "Sport",
            "Storia e Biografie")
    );
    private String riassunto = null;
    private String recensione = null;
    private String voto = null;
    public static final List<String> votiDisponibili = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setNumPagine(String numPagine) {
        this.numPagine = numPagine;
    }

    public void setSegnalibro(String segnalibro) {
        this.segnalibro = segnalibro;
    }

    public void setHaiLetto(Boolean haiLetto) {
        this.haiLetto = haiLetto;
    }

    public void setTagLibro(String tagLibro) {
        this.tagLibro.add(tagLibro);
    }
    public void setRiassunto(String riassunto) {
        this.riassunto = riassunto;
    }

    public void setRecensione(String recensione) {
        this.recensione = recensione;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getGenere() {
        return genere;
    }

    public String getNumPagine() {
        return numPagine;
    }

    public String getSegnalibro() {
        return segnalibro;
    }

    public Boolean getHaiLetto() {
        return haiLetto;
    }

    public List<String> getTagLibro() {
        return tagLibro;
    }
    public String getRiassunto() {
        return riassunto;
    }

    public String getRecensione() {
        return recensione;
    }

    public String getVoto() {
        return voto;
    }
}
