import java.util.ArrayList;

class Ksiazka {
    String tytul;
    String autor;

    Ksiazka(String t, String a) {
        tytul = t;
        autor = a;
    }
}

class Biblioteka {
    ArrayList<Ksiazka> lista = new ArrayList<>();

    void dodajKsiazke(Ksiazka k) {
        lista.add(k);
    }

    void wyswietlWszystkie() {
        for (Ksiazka k : lista) {
            System.out.println(k.tytul + " " + k.autor);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();

        b.dodajKsiazke(new Ksiazka("Wiedzmin", "Sapkowski"));
        b.dodajKsiazke(new Ksiazka("1984", "Orwell"));
        b.dodajKsiazke(new Ksiazka("Hobbit", "Tolkien"));

        b.wyswietlWszystkie();
    }
}
