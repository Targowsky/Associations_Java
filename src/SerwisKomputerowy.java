import java.util.ArrayList;
import java.util.List;

public class SerwisKomputerowy {
    private String nazwaSerwisu;
    private String adres;
    private int latNaRynku;
    private List<Naprawa> listaNapraw = new ArrayList<>();

    public SerwisKomputerowy(String nazwaSerwisu, String adres, int latNaRynku) {
        this.nazwaSerwisu = nazwaSerwisu;
        this.adres = adres;
        this.latNaRynku = latNaRynku;
    }

    public void dodajNaprawe(Naprawa naprawa) {
        if (naprawa == null) {
            throw new IllegalArgumentException("SerwisKomputerowy shouldn't be null!");
        }
        if (!listaNapraw.contains(naprawa)) {
            listaNapraw.add(naprawa);
        }
    }

    public void usunNaprawe(Naprawa naprawa) {
        listaNapraw.remove(naprawa);
    }

    public List<Naprawa> getListaNapraw(){
        return listaNapraw;
    }

    @Override
    public String toString() {
        return "SerwisKomputerowy{" +
                "nazwaSerwisu='" + nazwaSerwisu + '\'' +
                ", adres='" + adres + '\'' +
                ", latNaRynku=" + latNaRynku +
                '}';
    }

}
