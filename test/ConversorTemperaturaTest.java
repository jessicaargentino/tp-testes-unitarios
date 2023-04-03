package test;

import org.junit.Assert;
import org.junit.Test;

import static src.ConversorTemperatura.converteCelsiusParaFahrenheit;

public class ConversorTemperaturaTest {
    @Test
    public void deveRetornarTrintaEDois(){
        Assert.assertEquals(Double.valueOf(32.0), converteCelsiusParaFahrenheit(0.0));
    }

    @Test
    public void deveRetornarSetentaESeisNegativo(){
        Assert.assertEquals(Double.valueOf(-76.0), converteCelsiusParaFahrenheit(-60.0));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(converteCelsiusParaFahrenheit(null));
    }

    @Test(expected= NumberFormatException.class)
    public void deveRetornarNumberFormatException(){
        converteCelsiusParaFahrenheit(Double.valueOf("A"));
    }

    @Test
    public void deveRetornarTrue(){
        Assert.assertTrue(converteCelsiusParaFahrenheit(5.6) instanceof Double);
    }
}
