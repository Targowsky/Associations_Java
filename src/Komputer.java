import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private String nazwa;
    private String rodzaj;
    private boolean czyPodkrecany;
    private List<Naprawa> listaNapraw = new ArrayList<>(); //ograniczenie BAG

    public Komputer(String nazwa, String rodzaj, boolean czyPodkrecany) {
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
        this.czyPodkrecany = czyPodkrecany;
    }
    public void dodajNaprawe(Naprawa naprawa) {
        if (naprawa == null) {
            throw new IllegalArgumentException("Komputer shouldn't be null!");
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
        return "Komputer{" +
                "nazwa='" + nazwa + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                ", czyPodkrecany=" + czyPodkrecany +
                '}';
    }
}
