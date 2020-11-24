/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab;
import java.util.*;
/**
 *
 * @author SANGEETHA
 */
public class min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a<b && a<c)
            System.out.printf("%d is smallest",a);
        else if(b<c)
            System.out.printf("%d is smallest",b);
        else
            System.out.printf("%d is smallest",c);
            
            
        
    }
    
}
