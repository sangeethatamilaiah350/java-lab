/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple2pack;
import simple2pack.sub2pack.*;//importing subpackage
/**
 *
 * @author SANGEETHA
 */
public class package2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("in simple package 2");
        System.out.println("accessing sub package of simplepackage 2");
        sub2pack obj=new sub2pack();
        obj.hello();
        
    }
    public void hello(){
        System.out.println("hello from simple packagee 2");
    }
    
}
