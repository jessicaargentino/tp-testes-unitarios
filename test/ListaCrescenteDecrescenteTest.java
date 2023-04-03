package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static src.ListaCrescenteDecrescente.listaOrdenada;

public class ListaCrescenteDecrescenteTest {

    @Test
    public void deveRetornarTrueListaCrescente(){
        Assert.assertTrue(listaOrdenada(Arrays.asList(0, 2, 5, 8, 12, 15, 24)));
    }

    @Test
    public void deveRetornarTrueListaDecrescente(){
        Assert.assertTrue(listaOrdenada(Arrays.asList(94, 55, 40, 22, 12, 6)));
    }

    @Test
    public void deveRetornarFalseListaOrdenada(){
        Assert.assertFalse(listaOrdenada(Arrays.asList(95, 6, 52, 8, 9, 22, 0)));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(listaOrdenada(null));
    }

    @Test
    public void deveRetornarTrueUmElemento(){
        Assert.assertTrue(listaOrdenada(Arrays.asList(2)));
    }
}
