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
public class perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter side");
        Scanner obj=new Scanner(System.in);
        int side=obj.nextInt();
        System.out.println("the perimeter is "+(4*side));
        
    }
    
}
