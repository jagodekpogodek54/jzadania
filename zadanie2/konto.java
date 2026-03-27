class KontoBankowe {
    private double saldo;

    void wplac(double kwota) {
        saldo += kwota;
    }

    void wyplac(double kwota) {
        if (kwota <= saldo) saldo -= kwota;
    }

    double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        KontoBankowe k = new KontoBankowe();
        k.wplac(1000);
        k.wyplac(300);
        System.out.println(k.getSaldo());
    }
}

