/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple2pack.sub2pack;
import simple2pack.*;//importing package
/**
 *
 * @author SANGEETHA
 */
public class sub2pack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("in simple package 2 subpack");
        System.out.println("accessing simple package 2");
        package2 obj=new package2();
        obj.hello();
        
    }
    public void hello(){
        System.out.println("hello from simple subpackage 2");
    }
    
}
