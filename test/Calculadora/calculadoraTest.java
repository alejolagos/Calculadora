/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import calculadora.calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejo JL
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculadora method, of class calculadora.
     */
    @Test
    public void testCalculadora() {
        System.out.println("calculadora");
        String memoria1 = "1";
        String memoria2 = "1";
        String signo = "*";
        String expResult = "1.0";
        String result = calculadora.calculadora(memoria1, memoria2, signo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarNumericoSigno method, of class calculadora.
     */
    @Test
    public void testValidarNumericoSigno() {
        System.out.println("validarNumericoSigno");
        String memoria1 = "";
        String memoria2 = "";
        String signo = "";
        boolean expResult = false;
        boolean result = calculadora.validarNumericoSigno(memoria1, memoria2, signo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validarDivisionPorCero method, of class calculadora.
     */
    @Test
    public void testValidarDivisionPorCero() {
        System.out.println("validarDivisionPorCero");
        String memoria2 = "0";
        String signo = "/";
        boolean expResult = false;
        boolean result = calculadora.validarDivisionPorCero(memoria2, signo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class calculadora.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = false;
        boolean result = calculadora.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of existeUnPunto method, of class calculadora.
     */
    @Test
    public void testExisteMasDeUnPunto() {
        System.out.println("existeMasDeUnPunto");
        String cadena = "1.73...";
        boolean expResult = true;
        boolean result = calculadora.existeUnPunto(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
