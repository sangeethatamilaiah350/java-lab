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
public class reverse  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int[] array =new int[20];//or
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=obj.nextInt();
        int i,c,end=n-1;
        for(i=0;i<n;i++)
        {
            array[i]=obj.nextInt();
        }
        for(i=0;i<(n/2);i++)
        {
            c=array[i];
            array[i]=array[end];
            array[end]=c;
            end--;
            
        }
        for(i=0;i<n;i++)
            System.out.printf("%d ",array[i]);
        
        
    }
    
}
