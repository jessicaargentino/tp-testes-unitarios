package src;

import java.util.Arrays;
import java.util.List;

public class ListaOrdenada {
    public static boolean estaOrdenada(List<Integer> numeros) {
        if (numeros == null || numeros.size() <= 1) return true;

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) < numeros.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Boolean estaOrdenada = estaOrdenada(Arrays.asList(5, -2, 14, 45, 99, 3, 6, 25));
        System.out.println("Lista ordenada? " + estaOrdenada);
    }
}
