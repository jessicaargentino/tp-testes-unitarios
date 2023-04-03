package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static src.Media.calculaMedia;

public class MediaTest {

    @Test
    public void deveRetornarMediaOnze(){
        Assert.assertEquals(Integer.valueOf(11), calculaMedia(Arrays.asList(-5, 14, 22, 0, -6, 45)));
    }

    @Test(expected=ClassCastException.class)
    public void deveRetornarClassCastException(){
        List<? extends Number> list = Arrays.asList(5.2, 7.4, 8.5, 0, 9);
        calculaMedia((List<Integer>) list);
    }

    @Test(expected=NumberFormatException.class)
    public void deveRetornarClassCOastException(){
        List<String> list = Arrays.asList("A", "5", "12", "C");
        calculaMedia(Collections.singletonList(Integer.valueOf(list.toString())));
    }

    @Test(expected= NullPointerException.class)
    public void deveRetornarNullPointerException(){
        Assert.assertNull(calculaMedia(Arrays.asList(null)));
    }
}
