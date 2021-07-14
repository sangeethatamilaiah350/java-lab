/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author SANGEETHA
 */
public class lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a=10/10;
            Scanner obj=new Scanner(System.in);
            int b=Integer.parseInt(obj.next());
            int x[]=new int[10];
            x[0]=9;
            String y="sangeetha";
            char xx=y.charAt(9);
            System.out.println(xx);
            
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(NumberFormatException aa){
            System.out.println(aa);
        }
        catch(ArrayIndexOutOfBoundsException aaa){
            System.out.println(aaa);
        }
        catch(StringIndexOutOfBoundsException aaaa){
            System.out.println(aaaa);
        }
            
    
        
    }
    
}
