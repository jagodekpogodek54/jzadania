class Samochod {
    String marka;
    String model;
    int rokProdukcji;

    void wyswietlInfo() {
        System.out.println(marka + " " + model + " " + rokProdukcji);
    }
}

public class Main {
    public static void main(String[] args) {
        Samochod a = new Samochod();
        a.marka = "Ford";
        a.model = "Focus";
        a.rokProdukcji = 2018;

        Samochod b = new Samochod();
        b.marka = "Toyota";
        b.model = "Corolla";
        b.rokProdukcji = 2020;

        a.wyswietlInfo();
        b.wyswietlInfo();
    }
}
