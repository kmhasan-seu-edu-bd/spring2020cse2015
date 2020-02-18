/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.complexnumber;

/**
 *
 * @author seu
 */
public class ComplexNumber {
    // TODO change the data type from int to double
    // make sure you go through all necessary changes
    private int real;
    private int imaginary;
    
    public ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }
    
    public int getReal() {
        return real;
    }
    
    public int getImaginary() {
        return imaginary;
    }
    
    public ComplexNumber add(ComplexNumber b) {
        ComplexNumber a = this;
        int real = a.real + b.real;
        int imaginary = a.imaginary + b.imaginary;
        ComplexNumber c = new ComplexNumber(real, imaginary);
        return c;
    }
    
    // TODO add three more methods to cover subtract, multiply and divide
    public ComplexNumber subtract(ComplexNumber b) {
        ComplexNumber c = new ComplexNumber(0, 0);
        return c;
    }
}


















