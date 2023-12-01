public class Main {
    public static void main(String[] args) {
        // numeri
        divisione(4,2);
        //uno dei due è null
        divisione(null, 0);
    }
    public static void divisione(Integer numeratore, Integer denominatore) {
        int risultato = numeratore / denominatore;
        System.out.println("Risultato: " + risultato);
        try {
            if ((numeratore == null) && (denominatore == null)) {
                throw new ArithmeticException("null");
            }

        } catch (ArithmeticException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
}