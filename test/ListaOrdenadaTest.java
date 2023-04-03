package test;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static src.ListaOrdenada.estaOrdenada;

public class ListaOrdenadaTest {

    @Test
    public void deveRetornarTrue(){
        Assert.assertTrue(estaOrdenada(Arrays.asList(0, 2, 5, 8, 12, 15, 24)));
    }

    @Test
    public void deveRetornarFalse(){
        Assert.assertFalse(estaOrdenada(Arrays.asList(94, 45, 0, -5, 12, 36, 7, 6)));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(estaOrdenada(Arrays.asList(null)));
    }

    @Test(expected= ClassCastException.class)
    public void deveRetornarClassCastException(){
        List<? extends Number> list = Arrays.asList(5.2, 7.4, 8.5, 0, 9);
        estaOrdenada((List<Integer>) list);
    }
}
