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
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter a b and choice");

        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        char choice=obj.next().charAt(0);
        switch(choice)
        {
            case '+' :
                System.out.println("Addtion is "+(a+b));
                break;
            case '-':
                System.out.println("subration is  "+(a-b));
                break;
            case '*' :
                System.out.println("multiplication is "+(a*b));
                break;
            case '%':
                System.out.println("modulo is "+(a%b));
                break;
            case '/':
                System.out.println("division is "+(a%b));
                break;
            default :
                System.out.println("valid symbols are + - * / %");
                break;





                
        }
    }
    
}
