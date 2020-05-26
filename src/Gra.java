import java.util.ArrayList;
import java.util.List;

public class Gra {

    public String nazwa;
    public String rodzaj;
    private List<Gracz> gracze = new ArrayList<>();

    public Gra(String nazwa, String rodzaj){
        this.nazwa=nazwa;
        this.rodzaj=rodzaj;
    }

    public void dodajGracza(Gracz nowyGracz) {
        // Sprawdz czy już nie występuje
        if(!gracze.contains(nowyGracz)) {
            gracze.add(nowyGracz);
            // Kom. zwrotna
            nowyGracz.dodajGre(this);
        }
    }

    @Override
    public String toString() {
        String info = "Gra: " + nazwa + " z gatunku "+ rodzaj    + "\n" + "Gracze:" + "\n";
        // Info o graczach tej gry
        for(Gracz gamer : gracze) {
            info += " " + gamer.nick + "\n";
        }
        return info;
    }
}
