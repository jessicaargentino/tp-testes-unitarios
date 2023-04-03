package src;

public class Fatorial {
    public static int fatorial(Integer numero) {
        if (numero == 0) return 1;
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {
        System.out.printf("O fatorial de %d é: %d", 4, fatorial(4));
    }
}
