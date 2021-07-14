/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.simple;
import simple.subpackage1.*;
/**
 *
 * @author SANGEETHA
 */
public class simplepack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("in simple package 1");
       System.out.println("accessing  subpackage 1");
       sub1pack obj=new sub1pack();
       obj.show();
    }
    public void display(){
       System.out.println("welcome from simple java package 1");
    }
   
}