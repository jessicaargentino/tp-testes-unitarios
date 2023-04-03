package src;

import java.util.Arrays;
import java.util.List;

public class ListaCrescenteDecrescente {
    public static Boolean listaOrdenada(List<Integer> numeros) {
        int tamanho = numeros.size();
        boolean crescente = Boolean.TRUE;
        for (int i = 1; i < tamanho; i++) {
            if (numeros.get(i) < numeros.get(i-1)) {
                crescente = Boolean.FALSE;
                break;
            }
        }

        boolean decrescente = Boolean.TRUE;
        for (int i = 1; i < tamanho; i++) {
            if (numeros.get(i) > numeros.get(i-1)) {
                decrescente = Boolean.FALSE;
                break;
            }
        }

        return crescente || decrescente;
    }

    public static void main(String[] args) {
        System.out.printf("A lista é crescente ou decrescente? %b", listaOrdenada(Arrays.asList(15, 9, 8, 6, 5, 0)));
    }
}
