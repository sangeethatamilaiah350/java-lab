/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;
import java.util.Scanner;

/**
 *
 * @author SANGEETHA
 */
public class productdiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the amount and discount");
        Scanner obj=new Scanner(System.in);
        double amount=obj.nextDouble();
        double discount=obj.nextDouble();
        double c;
        c=(discount/100)*amount;
        System.out.println("the original price"+(amount-c));
       
        
    }
    
}
