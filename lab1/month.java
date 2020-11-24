/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pavi;

import java.util.Scanner;

/**
 *
 * @author PAVITHRA T
 */
public class Pavi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // convert the given number into months and days
        int m,n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of days");
        m=s.nextInt();
        n=m%30;
        i=m/30;
        if(n!=0)
        {
        System.out.println("days="+n);
        }
        if(i!=0)
        {
        System.out.println("months="+i);
        }
    }
    
}
