/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.complexnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author seu
 */
public class ComplexNumberTest {
    
    public ComplexNumberTest() {
    }

    @Test
    public void testAdd1() {
        ComplexNumber a = new ComplexNumber(3, 6);
        ComplexNumber b = new ComplexNumber(2, -3);
        ComplexNumber c = a.add(b);
        Assertions.assertEquals(5, c.getReal());
        Assertions.assertEquals(3, c.getImaginary());
    }

    @Test
    public void testAdd2() {
        ComplexNumber a = new ComplexNumber(13, 6);
        ComplexNumber b = new ComplexNumber(2, 2);
        ComplexNumber c = a.add(b);
        Assertions.assertEquals(15, c.getReal());
        Assertions.assertEquals(8, c.getImaginary());
    }
    
    // TODO add necessary test methods
    @Test
    public void testSutract1() {
        ComplexNumber a = new ComplexNumber(13, 6);
        ComplexNumber b = new ComplexNumber(2, 2);
        ComplexNumber c = a.subtract(b);
        Assertions.assertEquals(11, c.getReal());
        Assertions.assertEquals(4, c.getImaginary());
    }    
    
    
}
