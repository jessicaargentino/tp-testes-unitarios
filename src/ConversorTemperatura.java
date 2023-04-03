package src;

public class ConversorTemperatura {
    public static Double converteCelsiusParaFahrenheit(Double celsius){
        return ((celsius * 1.8) + 32);
    }
    public static void main(String[] args) {
        System.out.printf("A temperatura %.2fº em Fahrenheit é: %.2f", 0.0, converteCelsiusParaFahrenheit(0.0));
    }
}
