import java.util.ArrayList;
import java.util.List;

public class Naprawa {
    private String dataNaprawy;
    private int koszt;
    private Komputer komputer;
    private SerwisKomputerowy serwisKomputerowy;

    public Komputer getKomputer() {
        return komputer;
    }

    public SerwisKomputerowy getSerwisKomputerowy() {
        return serwisKomputerowy;
    }

    public void setKomputer(Komputer nowyKomputer) {
        // przy tworzeniu nowego obiektu
        if(nowyKomputer == null){
            throw new IllegalArgumentException("Ta relacja wymaga obiektu Komputer!");
        }
        // przy próbie modyfikacji istniejacego obiektu najpierw usuniemy stare powiazania
        if (this.komputer != null && this.komputer != nowyKomputer){
            usunKomputer();
        }
            this.komputer = nowyKomputer;
            nowyKomputer.dodajNaprawe(this);
        }

    public void setSerwisKomputerowy(SerwisKomputerowy nowySerwisKomputerowy) {
        // przy tworzeniu nowego obiektu
        if(nowySerwisKomputerowy == null){
            throw new IllegalArgumentException("Ta relacja wymaga obiektu Serwis Komputerowy!");
        }
        // przy próbie modyfikacji istniejacego obiektu najpierw usuniemy stare powiazania
        if (this.serwisKomputerowy != null && this.serwisKomputerowy != nowySerwisKomputerowy){
            usunSerwisKomputerowy();
        }
            this.serwisKomputerowy = nowySerwisKomputerowy;
            nowySerwisKomputerowy.dodajNaprawe(this);
        }

    public void usunKomputer(){
        this.komputer.usunNaprawe(this);
        this.komputer = null;
    }

    public void usunSerwisKomputerowy(){
        this.serwisKomputerowy.usunNaprawe(this);
        this.serwisKomputerowy = null;
    }

    public Naprawa(String dataNaprawy, int koszt, Komputer komputer, SerwisKomputerowy serwisKomputerowy) throws Exception {
        this.dataNaprawy = dataNaprawy;
        this.koszt = koszt;
        setKomputer(komputer);
        setSerwisKomputerowy(serwisKomputerowy);
    }

    @Override
    public String toString() {
        return "(" + getDataNaprawy() + ", koszt: " + getKoszt() + ") "
                + getKomputer() + " BYŁ NAPRAWIANY W -> " + getSerwisKomputerowy();
    }

    public String getDataNaprawy() {
        return dataNaprawy;
    }

    public int getKoszt() {
        return koszt;
    }
}
