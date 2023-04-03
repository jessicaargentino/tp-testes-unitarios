package test;

import org.junit.Assert;
import org.junit.Test;

import static src.Fatorial.fatorial;

public class FatorialTest {

    @Test
    public void deveRetornarVinteQuatro(){
        Assert.assertEquals(24, fatorial(4));
    }

    @Test
    public void deveRetornarUm(){
        Assert.assertEquals(1, fatorial(0));
    }

    @Test(expected= StackOverflowError.class)
    public void deveRetornarStackOverflowError(){
        fatorial(-5);
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(fatorial(null));
    }

    @Test(expected= NumberFormatException.class)
    public void deveRetornarNumberFormatException(){
        fatorial(Integer.valueOf("A"));
    }
}
