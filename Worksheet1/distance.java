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
public class distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter X1 X2 Y1 Y2");
        Scanner obj=new Scanner(System.in);
        int x1=obj.nextInt();
        int x2=obj.nextInt();
        int y1=obj.nextInt();
        int y2=obj.nextInt();
        double a,b,c;
        a=Math.pow(x2-x1,2);
        b=Math.pow(y2-y1,2);
        c=Math.sqrt(a+b);
        System.out.println("the distance is "+c);
        
    }
    
}
