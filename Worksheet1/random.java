/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;
import java.util.*;
/**
 *
 * @author SANGEETHA
 */
public class random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the random number betweem");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(Math.random()*n);


    }
    
}
