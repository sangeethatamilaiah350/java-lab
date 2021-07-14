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
public class counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array=new int[20];
        Scanner obj=new Scanner(System.in);
        int i,positive=0,negative=0,zeros=0;
        System.out.println("enter number of elements ");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {  array[i]=obj.nextInt();
           if (array[i]>0)
              positive ++;
           else if (array[i]<0)
               negative++;
           else
               zeros++;
           
         }
         
       System.out.println("number of positives "+" "+positive);
       System.out.println("number of negatives"+" "+negative);
       System.out.println("number of zeros"+" "+zeros);
        
    }
    
}
