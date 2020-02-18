/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.rationalnumber;

/**
 *
 * @author seu
 */
public class RationalNumber {
    private int numerator;
    private int denominator;
    
    public RationalNumber() {
        numerator = 0;
        denominator = 0;
    }
    
    public RationalNumber(int p, int q) {
        numerator = p;
        denominator = q;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public RationalNumber add(RationalNumber b) {
        RationalNumber a = this;
        int numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        int denominator = a.denominator * b.denominator;
        
        RationalNumber result = new RationalNumber(numerator, denominator);
        
        return result;
    }

}
