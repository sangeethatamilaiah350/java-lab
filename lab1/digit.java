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
public class digit 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=0,r;
        while(n>0)
        {
         r=n%10;
         i++;
        n=n/10;     
        }
        if (i==1)
        System.out.printf("the number is of %d digit",i);
        else
        System.out.printf("the number is of %d digits",i);
    }
}
