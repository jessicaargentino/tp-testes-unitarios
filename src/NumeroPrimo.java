package src;

public class NumeroPrimo {
    public static Boolean verificaPrimo(Integer numero) {
        if(numero <= 1) return Boolean.FALSE;

        for (int n = 2; n < numero; n++) {
            if (numero % n == 0) {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        System.out.printf("O número %d é primo? %b", 9, verificaPrimo(9));
    }
}
