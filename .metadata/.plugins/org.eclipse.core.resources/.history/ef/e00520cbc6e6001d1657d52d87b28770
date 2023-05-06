package tp_test2;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;


public class TestEquationSecondDegre  extends TestCase{

    @Test
    public void test2Racines() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, 1, -2);
        double[] expectedRacines = {1,-2};
        assertArrayEquals(expectedRacines, p.calculRacines(), 0);
    }

    @Test
    public void test1Racine() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, -2, 1);
        double[] expectedRacines = {1};
        assertTrue(Arrays.equals(expectedRacines, p.calculRacines()));
    }

    @Test
    public void testPasDeRacineReelle() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, 1, 1);
        double[] expectedRacines = null;
        assertEquals(expectedRacines, p.calculRacines());
    }
    
   
}
