public class CurrencyConverter {
    int rupee = 63;
    int dirha = 3;
    int real = 3;
    int chileanPeso = 595;
    int mexicanPeso = 18;
    int _yen = 107;
    int $australian = 2;
    int dollars;
    int Rupee = 63;

    void printCurrencies () {
        System.out.println("rupee: $" + rupee);
        System.out.println("dirha: $" + dirha);
        System.out.println("real: $" + real);
        System.out.println("chileanPeso: $" + chileanPeso);
        System.out.println("mexicanPeso: $" + mexicanPeso);
        System.out.println("_yen: $" + _yen);
        System.out.println("$australian: $" + $australian);
        System.out.println("dollars: $" + dollars);
        System.out.println("Rupee: $" + Rupee);
    }
    public static void main(String[] args) throws Exception {
        CurrencyConverter c = new CurrencyConverter();
        c.printCurrencies();
    }
}
