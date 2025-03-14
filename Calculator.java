/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author PASSW
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1;
        double num2;
        double sum;
        double division;
        double minus;
        double product;
        
        num1 = 20;
        num2 = 4;
        
        sum = num1+num2;
         
        division = num1/num2;
        
        minus = num1-num2;
        
        product = num1*num2;
        
        System.out.println("sum :" + num1 + "+ " + num2 +"= " + sum);
        System.out.println("division :" + num1 + "/ " + num2 +"= " + division); 
        System.out.println("minus :" + num1 + "- " + num2 +"= " + minus); 
        System.out.println("product:" + num1 + "* " + num2 +"= " + product); 
    }
    
}
