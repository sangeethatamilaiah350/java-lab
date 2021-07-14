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
public class valid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr a number");
        int x=obj.nextInt();
        if(x<=9 && x>=0)
            k=1;
        else
            k=0;
        switch(k)
        {
        case 1:
                System.out.println("valid");
                break;
        case 0:
                System.out.println("invalid entry");
                break;
        default:
            break;
        }
        
    }
    
}
