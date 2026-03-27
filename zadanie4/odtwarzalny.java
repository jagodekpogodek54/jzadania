interface Odtwarzalny {
    void play();
    void stop();
}

class Film implements Odtwarzalny {
    public void play() {
        System.out.println("Wyświetlam obraz...");
    }

    public void stop() {}
}

class Piosenka implements Odtwarzalny {
    public void play() {
        System.out.println("Gram muzykę...");
    }

    public void stop() {}
}

public class Main {
    public static void main(String[] args) {
        Odtwarzalny f = new Film();
        Odtwarzalny p = new Piosenka();

        f.play();
        p.play();
    }
}

