/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jes
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        //arrange
        System.out.println("Prueba suma");
        double num1 = 8.3;
        double num2 = 7.2;
        double expResult = 15.5;
        //act
        double result = Calculadora.sumar(num1, num2);
        //assert
        assertEquals(expResult, result, 0.0);
    }
    
}
