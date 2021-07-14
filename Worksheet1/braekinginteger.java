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
public class braekinginteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[20];
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an decimal");
        int n=obj.nextInt();int s,i=0;
        while(n!=0)
        {
          s=n%10;
          a[i]=s;
          n=n/10;
          i++;
        }
                
        for(i=(i-1) ;i>=0;i--)
           System.out.printf("%d ",a[i]);
                  

    }
    
}
