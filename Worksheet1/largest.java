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
public class largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter three number");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if (a>b & a>c)
             System.out.println(a+" is bigest ");
        else if(b>c)
            System.out.println(b+" is bigest ");
        else
            System.out.println(c+" is bigest ");
    }
    
}
