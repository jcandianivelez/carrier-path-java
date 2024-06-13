public class App {
    static public class CurrencyConventer {
        double[] exchangeRates = {
            63.00, // Rupee
            3.00, // Dirham
            3.00, // Real
            595.00, // Chilean Peso
            18.00, // Mexican Peso
            107.00, // Yen
            2.00,  // Australian
        };

        void printCurrencies() {
            System.out.println("Rupee: $" + exchangeRates[0]);
            System.out.println("Dirham: $" + exchangeRates[1]);
            System.out.println("Real: $" + exchangeRates[2]);
            System.out.println("Chilean Peso: $" + exchangeRates[3]);
            System.out.println("Mexican Peso: $" + exchangeRates[4]);
            System.out.println("Yen: $" + exchangeRates[5]);
            System.out.println("Australian: $" + exchangeRates[6]);
        }
    }


    public static void main(String[] args) throws Exception {
        CurrencyConventer c = new CurrencyConventer();
        c.printCurrencies();
    }
}
