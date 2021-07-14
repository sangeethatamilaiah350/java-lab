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
public class fib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=1;
    
        int i=2,c,n;
        System.out.println("enter the number of elements");
        Scanner obj=new Scanner(System.in);
        n =obj.nextInt();
        System.out.println("Fibonacci series");
        System.out.println(a);
        System.out.println(b);
        while (i<n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }
    }
    
}
