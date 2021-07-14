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
public class CGPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the number of subject");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("enter the grade and credit");
        int []grade=new int[20];
        int []credit=new int[20];
        int i,sum=0,sumc=0;
        for(i=0;i<n;i++)
        {
            grade[i]=obj.nextInt();
            credit[i]=obj.nextInt();
            sum+= (grade[i]*credit[i]);
            sumc +=credit[i];
        }
        System.out.println("the cgpa is"+" "+sum/sumc);
        
    }
    
}
