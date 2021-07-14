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
public class sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]array=new int[20];
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number of elements");
        int i,j,c,n;
        n=obj.nextInt();
        for(i=0;i<n;i++)
            array[i]=obj.nextInt();
        
        for(i=0;i<n;i++)//8 5 3 0 1
        { 
            for(j=i+1;j<n;j++)
            {
                if (array[i]>array[j])
                {
                    c=array[i];
                    array[i]=array[j];//array[i],array[j]=array[j],array[i]
                    array[j]=c;
                            
                }
                
            }
        }
        for(i=0;i<n;i++)
            System.out.printf("%d ",array[i]);
                
    }
    
}
