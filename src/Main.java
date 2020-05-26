import java.util.List;

public class Main {
    public static void testujAsocjacjeZwykla(){
        Gra gra = new Gra("LeaugeOfLegends","MOBA");
        Gra gra1 = new Gra("CS:GO","FPS");
        Gracz gracz = new Gracz("Filip","Filozof","x@32nj",1);
        Gracz gracz1 = new Gracz("Adam","Malysz","Maly@h",2);
        Gracz gracz2 = new Gracz("Artur","Boruc","B0ruc",3);
        Gracz gracz3 = new Gracz("Paweł","Warszawski","WarsAW",4);
        Gracz gracz4 = new Gracz("Ktos","Cos","KTOCO",5);

        gra.dodajGracza(gracz);
        gra.dodajGracza(gracz1);
        gra.dodajGracza(gracz4);
        gra1.dodajGracza(gracz);
        gra1.dodajGracza(gracz2);
        gra1.dodajGracza(gracz3);
        gra1.dodajGracza(gracz4);
        gra1.dodajGracza(gracz1);

        System.out.println(gra);
        System.out.println(gra1);

        System.out.println(gracz);
        System.out.println(gracz2);
        System.out.println(gracz3);
        System.out.println(gracz4);
    }
    public static void testujAsocjacjeKwalifikowana() throws Exception {
        ForumGier forumGier1 = new ForumGier
                (1,"Mobafire","www.mobafire.com","gry MOBA i RPG");

        ForumGier forumGier2 = new ForumGier
                (2,"hellcase","www.hellcase.cc", "gry FPS i FFA");

        Gracz gracz = new Gracz("Filip","Filozof","x@32nj",1);
        Gracz gracz1 = new Gracz("Adam","Malysz","Maly@h",2);
        Gracz gracz2 = new Gracz("Artur","Boruc","B0ruc",3);
        Gracz gracz3 = new Gracz("Paweł","Warszawski","WarsAW",4);
        Gracz gracz4 = new Gracz("Ktos","Cos","KTOCO",5);
        Gracz gracz5 = new Gracz("Pasza","Biceps","sniperElite",6);

        gracz.dodajForumGryKwalifikowana(forumGier1);
        gracz.dodajForumGryKwalifikowana(forumGier2);
        gracz2.dodajForumGryKwalifikowana(forumGier2);
        gracz3.dodajForumGryKwalifikowana(forumGier2);
        gracz4.dodajForumGryKwalifikowana(forumGier2);
        gracz5.dodajForumGryKwalifikowana(forumGier2);
        gracz1.dodajForumGryKwalifikowana(forumGier1);

        //System.out.println(forumGier1);
        //System.out.println(forumGier2);

        System.out.println(gracz.wyswietlInfoKwalifikowana());
        System.out.println(gracz2.wyswietlInfoKwalifikowana());
        System.out.println(gracz3.wyswietlInfoKwalifikowana());
        System.out.println(gracz4.wyswietlInfoKwalifikowana());

        ForumGier forumGier3 = gracz.znajdźForumGryKwalifikowana(1);
        ForumGier forumGier4 = gracz.znajdźForumGryKwalifikowana(2);
        System.out.println(forumGier3);
        System.out.println(forumGier4);
    }
    public static void testujAsocjacjeKompozycja() throws Exception {
        KontoBankowe kontoBankowe =
                new KontoBankowe ("CitiBank","CitiGold","PL 60324234234239");
        KontoBankowe kontoBankowe1 =
                new KontoBankowe("Alior","AliorSelect","PL 12312315521342");
        KontoBankowe kontoBankowe2 =
                new KontoBankowe("ING","konto z lwem","PL 1235443453423");
        KontoBankowe kontoBankowe3 =
                new KontoBankowe("123123","123123","PL 1235443453423");


        kontoBankowe.nowaKartaDebetowa("CitiGoldDebit","102391293123");
        kontoBankowe1.nowaKartaDebetowa("AliorSuperb","131231231232");
        kontoBankowe.nowaKartaDebetowa("CitiGoldSelectPass","102391293124");



        System.out.println(kontoBankowe);
        System.out.println(kontoBankowe1);
        System.out.println(kontoBankowe2);
        System.out.println(KontoBankowe.getSetNumerow());
        //System.out.println(kontoBankowe3);

        System.out.println(kontoBankowe.getKartyDebetowe().get(0));
        System.out.println(kontoBankowe.getKartyDebetowe().get(1));

        System.out.println(kontoBankowe1.wyswietlajKarty());
    }
    public static void main(String[] args) throws Exception {
        // TODO asocjacja zwykła, z atrybutem, kwalifikowana, kompozycja
        //testujAsocjacjeZwykla();
        //testujAsocjacjeKwalifikowana();
        //testujAsocjacjeKompozycja();
        /*KontoBankowe kontoBankowe =
                new KontoBankowe ("CitiBank","CitiGold","PL 60324234234239");
        System.out.println(kontoBankowe);
        KontoBankowe kontoBankowe1 =
                new KontoBankowe("Alior","AliorSelect","PL 12312315521342");
        System.out.println(kontoBankowe1);
        KontoBankowe kontoBankowe2 =
                new KontoBankowe("ING","konto z lwem","PL 1235443453423");
        System.out.println(kontoBankowe2);
        //--- TESTOWANIE OGRANICZENIA UNIQUE ---//
        kontoBankowe.setNumerRachunku("PL 12312315521342");
        KontoBankowe kontoBankowe3 =
                new KontoBankowe("123123","123123","PL 1235443453423");
        //--- KONIEC TESTOWANIA OGRANICZENIA UNIQUE ---//*/
        //kontoBankowe.setNumerRachunku("PL 1235443453423");
        //kontoBankowe.nowaKartaDebetowa("CitiGoldDebit","102391293123");
        //System.out.println(kontoBankowe.wyswietlajKarty());
        //--- TESTOWANIE OGRANICZENIA ATRYBUTU ---//
        //kontoBankowe1.nowaKartaDebetowa("AliorDebit","002312345678");
        //kontoBankowe1.nowaKartaDebetowa("AliorDebit","123234");

        Komputer komp = new Komputer("skladakJakis","PC",true);
        Komputer komp1 = new Komputer("skladakTakis","Laptop",false);
        Komputer komp2 = new Komputer("komputerTomka","PC",true);
        SerwisKomputerowy serwis = new SerwisKomputerowy("Serwis u Filipa", "Jakastam 5d",15);
        SerwisKomputerowy serwis1 = new SerwisKomputerowy("Serwis Morele", "Jakastaka 3d",5);
        Naprawa naprawa = new Naprawa("12-12-2012",500,komp,serwis);
        Naprawa naprawa3 = new Naprawa("13-12-2012",700,komp,serwis);
        Naprawa naprawa1 = new Naprawa("12-12-1221",1000,komp,serwis1);
        Naprawa naprawa2 = new Naprawa("11-02-1995",700,komp2,serwis1);
        System.out.println(serwis1.getListaNapraw());
        naprawa2.usunSerwisKomputerowy();
        System.out.println(serwis1.getListaNapraw());
        naprawa2.setSerwisKomputerowy(serwis);
        System.out.println(serwis.getListaNapraw());
        naprawa2.usunKomputer();
        System.out.println(naprawa2);
        System.out.println(serwis1.getListaNapraw());
        System.out.println(komp2.getListaNapraw());
        naprawa2.setKomputer(komp);
        System.out.println(naprawa2);
        System.out.println(komp.getListaNapraw());
    }
}
