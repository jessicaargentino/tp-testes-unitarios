package src;

import java.util.Arrays;
import java.util.List;

public class Media {
    public static Integer calculaMedia(List<Integer> numeros){
        Integer num = 0;

        for (Integer n : numeros) {
            num += n;
        }
        return (num / numeros.size());
    }

    public static void main(String[] args) {
        System.out.println("Média: " + calculaMedia(Arrays.asList(1, 5, 7, 8, 3, 70)));
    }
}
