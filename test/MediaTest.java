package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static src.Media.calculaMedia;

public class MediaTest {

    @Test
    public void deveRetornarMediaOnze(){
        Assert.assertEquals(Integer.valueOf(11), calculaMedia(Arrays.asList(-5, 14, 22, 0, -6, 45)));
    }

    @Test
    public void deveRetornarMediaMenosDez(){
        Assert.assertEquals(Integer.valueOf(-10), calculaMedia(Arrays.asList(-5, -3, -9, -25, -12)));
    }

    @Test
    public void deveRetornarMediaVinteNove(){
        Assert.assertEquals(Integer.valueOf(29), calculaMedia(Arrays.asList(2, 6, 22, 45, 70)));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(calculaMedia(Arrays.asList(null)));
    }

    @Test(expected=ClassCastException.class)
    public void deveRetornarClassCastException(){
        List<? extends Number> list = Arrays.asList(5.2, 7.4, 8.5, 0, 9);
        calculaMedia((List<Integer>) list);
    }
}
