/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.rationalnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author seu
 */
public class RationalNumberTest {
    
    public RationalNumberTest() {
    }

    @Test
    public void testAdd1() {
        RationalNumber a = new RationalNumber(3, 3);
        RationalNumber b = new RationalNumber(1, 3);
        RationalNumber c = a.add(b);
        Assertions.assertEquals(4, c.getNumerator());
        Assertions.assertEquals(3, c.getDenominator());
    }

    @Test
    public void testAdd2() {
        RationalNumber a = new RationalNumber(1, 3);
        RationalNumber b = new RationalNumber(2, 3);
        RationalNumber c = a.add(b);
        Assertions.assertEquals(1, c.getNumerator());
        Assertions.assertEquals(1, c.getDenominator());
    }
    
}










