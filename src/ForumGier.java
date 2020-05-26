import java.util.ArrayList;
import java.util.List;

public class ForumGier {

    private int idFora;
    public String nazwaForum;
    private String adresStronyInternetowej; //REGEX OGRANICZENIE WLASNE
    public String tematyka;
    private List<Gracz> gracze = new ArrayList<>();

    public void setAdresStronyInternetowej(String adresStronyInternetowej) {
        if(adresStronyInternetowej==null){
            throw new IllegalArgumentException("adres nie może być nullem!");
        }
        if(!adresStronyInternetowej.matches("^(www\\.)(\\w+\\.)com$|pl$")){
            throw new IllegalArgumentException("Adres musi miec postac www.costam.com lub www.costam.pl");
        }
        this.adresStronyInternetowej = adresStronyInternetowej;
    }

    public ForumGier(int idFora, String nazwaForum, String adresStronyInternetowej, String tematyka){
        this.idFora=idFora;
        this.nazwaForum=nazwaForum;
        this.tematyka=tematyka;
        setAdresStronyInternetowej(adresStronyInternetowej);
    }

    public int getIdFora() {
        return idFora;
    }

    public void dodajGracza(Gracz nowyGracz) {
        // Sprawdz czy juz nie istnieje
        if(!gracze.contains(nowyGracz)) {
            gracze.add(nowyGracz);
            // Kom. zwrotna
            nowyGracz.dodajForumGryKwalifikowana(this);
        }
    }

    @Override
    public String toString() {
        String info = "Forum growe " + nazwaForum +" o adresie: "+ adresStronyInternetowej+ " o tematyce "+ tematyka + "\n" + "Gracze:" + "\n";
        // Dodaj info o graczach tego forum
        for(Gracz gamer : gracze) {
            info += " " + gamer.imie + gamer.nazwisko + "\n";
        }
        return info;
    }
}
