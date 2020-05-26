import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KontoBankowe {
    private String nazwaBankuKonta;
    private String nazwaKonta;
    private String numerRachunku;
    private static Set<String> setNumerow = new HashSet<>();
    private List<KartaDebetowa> kartyDebetowe = new ArrayList<>();

    public static Set<String> getSetNumerow() {
        return setNumerow;
    }

    public void setNumerRachunku(String numerRachunku) throws Exception {
        if(setNumerow.contains(numerRachunku)){
            throw new Exception("Nie można ustawić numeru rachunku na podany, gdyż już istnieje!");
        }
        setNumerow.add(numerRachunku);
        this.numerRachunku = numerRachunku;
    }

    public KontoBankowe(String nazwaBankuKonta, String nazwaKonta, String numerRachunku) throws Exception {
        this.nazwaBankuKonta=nazwaBankuKonta;
        this.nazwaKonta = nazwaKonta;
        setNumerRachunku(numerRachunku);
    }
    public KartaDebetowa nowaKartaDebetowa(String newDebitCard, String newCardNumber) throws Exception {
        KartaDebetowa DebitCard = new KartaDebetowa(newDebitCard, newCardNumber);
        kartyDebetowe.add(DebitCard);
        return DebitCard;
    }

    public List<KartaDebetowa> getKartyDebetowe() {
        return kartyDebetowe;
    }

    public String wyswietlajKarty() {
        String info = "Dla konta o nazwie " + nazwaKonta + " o rachunku " + numerRachunku + "\n";
        info += "Karty debetowe: \n";
        for (KartaDebetowa debitCards : kartyDebetowe) {
            info += "nr karty: " + debitCards.numerKarty + " " + "rodzaj karty: " + debitCards.rodzajKarty + "\n";
        } return info;
    }

    @Override
    public String toString() {
        String info =
                "nazwa tego konta to: " + nazwaKonta + " numer rachunku przypisany do konta: " + numerRachunku +"\n";
        return info; }


    public class KartaDebetowa {
        private String rodzajKarty;
        private String numerKarty;

        public void setNumerKarty(String numerKarty) {
            if (numerKarty.length() != dlugoscNumeruKarty) {
                throw new IllegalArgumentException ("Dlugosc numeru karty powinna wynosić "+dlugoscNumeruKarty);
            }else if(numerKarty.charAt(0)==nieZaczynaj){
                throw new IllegalArgumentException("Numer karty nie może rozpoczynać się od "+nieZaczynaj);
            }else {
                this.numerKarty = numerKarty;
            }
        }

        private KartaDebetowa(String rodzajKarty, String numerKarty) throws Exception {
            this.rodzajKarty = rodzajKarty;
            setNumerKarty(numerKarty);
        }
        @Override
        public String toString() {
            return "Rodzaj karty debetowej to: " + rodzajKarty + " natomiast numer karty to: " + numerKarty +"\n";
        }
    }
    private static int dlugoscNumeruKarty = 12;
    private static char nieZaczynaj = '0';
}
