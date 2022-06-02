/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package francisco_javier_calculadora_ba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javi
 */
public class CalculadoraTest {
    
    private Calculadora miCalculadora; 
    private int result;
    private int expResult;

    public CalculadoraTest() {
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        miCalculadora=new Calculadora(8,4);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
        miCalculadora= null;
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        expResult = 12;
        result = miCalculadora.suma();
        assertEquals("¡Hay un error!",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        expResult = 4;
        result = miCalculadora.resta();
        assertEquals("¡Hay un error!",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        expResult = 32;
        result = miCalculadora.multiplica();
        assertEquals("¡Hay un error!",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        expResult = 2;
        result = miCalculadora.divide();
        assertEquals("¡Hay un error!",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
