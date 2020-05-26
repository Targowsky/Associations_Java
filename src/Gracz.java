import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Gracz {

    private int id;
    public String imie;
    public String nazwisko;
    public String nick;

    public List<Gra> getGry() {
        return gry;
    }

    private List<Gra> gry = new ArrayList<>();
    private List<ForumGier> foraGier = new ArrayList<>();

    public Gracz(String imie, String nazwisko, String nick, int id){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nick=nick;
        this.id=id;
        //this.gra.add(gra);
    }
    public void dodajGre(Gra nowaGra) {
    //sprawdz czy juz nie istnieje
        if(!gry.contains(nowaGra)) {
            gry.add(nowaGra);
    //kom. zwrotna
            nowaGra.dodajGracza(this);
        }
    }
    /*public void dodajForumGier(ForumGier noweForumGier) {
        //sprawdz czy juz nie istnieje
        if(!foraGier.contains(noweForumGier)) {
            foraGier.add(noweForumGier);
        //kom. zwrotna
            noweForumGier.dodajGracza(this);
        }
    }*/

    private Map<Integer, ForumGier> forumGierKwalifikowana = new TreeMap<>();

    public void dodajForumGryKwalifikowana(ForumGier noweForumGier) {
        //atrybut musi być unikalny!!!!!.
        if(!forumGierKwalifikowana.containsKey(noweForumGier.getIdFora())) {
            // dodaj do treemapy z kluczem = id forum gier
            forumGierKwalifikowana.put(noweForumGier.getIdFora(), noweForumGier);
            // komunikacja zwrotna.
            noweForumGier.dodajGracza(this);
        }
    }

    public ForumGier znajdźForumGryKwalifikowana(int idForum) throws Exception {
    //sprawdz czy juz nie wystepuje
        if(!forumGierKwalifikowana.containsKey(idForum)) {
            throw new Exception("Nie można znaleźć forum gry o nazwie: " + idForum);
        }
        return forumGierKwalifikowana.get(idForum);
    }

    public String wyswietlInfoKwalifikowana(){
        String info = "imie i nazwisko: " + imie+ " " + "\n"+"Fora z których korzysta:"+"\n";
        // pokaż fora z którzych korzysta
        for(ForumGier gameForum : foraGier) {
            info += " " + gameForum.nazwaForum + "\n";
        }
        return info;
    }

    @Override
    public String toString() {
        String info = "imie i nazwisko: " + imie+ " " + "\n"+"Gry w które gra:"+"\n";
        // pokaż gry w które gra
        for(Gra game : gry) {
            info += " " + game.nazwa + "\n";
        }
        return info;
    }


}
