package test;

import org.junit.Assert;
import org.junit.Test;

import static src.NumeroPrimo.verificaPrimo;

public class NumeroPrimoTest {

    @Test
    public void deveRetornarTrue(){
        Assert.assertTrue(verificaPrimo(3));
    }

    @Test
    public void deveRetornarFalse(){
        Assert.assertFalse(verificaPrimo(9));
    }

    @Test
    public void deveRetornarFalseParaNegativos(){
        Assert.assertFalse(verificaPrimo(-3));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(verificaPrimo(null));
    }

    @Test(expected= NumberFormatException.class)
    public void deveRetornarNumberFormatException(){
        verificaPrimo(Integer.valueOf("A"));
    }
}
