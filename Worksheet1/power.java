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
public class power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter base number and power");
        int x=obj.nextInt();
        int y=obj.nextInt();
        int i,s=1;
        for(i=0;i<y;i++)
        {
           s=s*x; 
        }
        System.out.println(x+" "+"power"+" "+y+" "+"is "+s);
    }
    
}
