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
public class sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array=new int[20];int i,s=0;
        System.out.println("enter number of elements");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();   //int x=obj.nextInt();
        for(i=0;i<n;i++)
        {
            
                   s+= obj.nextInt();
           
                    
        }
      System.out.println("sum of elements is"+" "+s);  
    }
    
}
