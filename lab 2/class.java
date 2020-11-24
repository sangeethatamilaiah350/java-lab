/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

/**
 *
 * @author SANGEETHA
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee obj=new Employee(101,"sangeetha","tamilaiah",1000);
        System.out.println("EMPLOYEE DETAILS");
        System.out.printf("\nID: %d",obj.get_Id());
        System.out.printf("\nFirstName: %s",obj.get_FirstName());
        System.out.printf("\nLastName: %s",obj.get_LastName());
        System.out.printf("\nSalary: %d",obj.get_Salary());
        obj.set_Salary(2000);
        System.out.printf("\nUpdatedSalary: %d",obj.get_Salary());
        System.out.printf("\nAnnualSalary: %d",obj.get_AnnualSalary());
        System.out.printf("\nRaisedSalary: %f",obj.raiseSalary(5));
        obj.to_String();
        System.out.println("\n");
        Ebill objj=new Ebill(123,"san",100,100,"comercial");
        System.out.println(objj.to_String());
        System.out.printf("BILL: %.2f rupees",objj.Tariff());
        System.out.println("\n");
        Ebill objj=new Ebill(123,"geetha",500,100,"domestic");
        System.out.println(objj.to_String());
        System.out.printf("BILL: %.2f rupees",objj.Tariff());
        
       
           
       }
       
       
       
 }

class Ebill
{
    //members of classEbill
    int CustomerNumber;
    String CustomerName;
    double PreviousMonth;
    double CurrentMonth;
    String Type;
    Ebill(int customernumber,String customername,double previousmonth,double currentmonth,String type){
        CustomerNumber=customernumber;
        CustomerName=customername;
        PreviousMonth=previousmonth;
        CurrentMonth=currentmonth;
        Type=type;
    }
    double Tariff(){
        double amount,total=PreviousMonth+CurrentMonth;
        if (Type=="domestic"){
            
           if (total<=100 )
               amount=total*1;
           else if(total>100 && total<=200)
               amount=100+(total-100)*2.50;
           else if(total>200 && total<=500)
               amount=100+250+(total-200)*4;
           else if(total>500)
               amount=100+250+1200+(total-500)*6;
           else
               amount=0.0;
               
            
               }
        else{
            
            if(total<=100)
                amount=total*2;
            else if(total>100 &&total<=200)
                amount=200+(total-100)*4.50;
            else if(total>200 &&total<=500)
                amount=200+450+(total-200)*6;
            else if (total>500)
                amount=100+450+1800+(total-500)*7;
            else
                amount=0.0;
            
            
        }
    return amount;
    }
    String to_String(){
        return  "customer number: "+CustomerNumber +"\ncustomer name: "+ CustomerName + "\nUNITS :"+(PreviousMonth+ CurrentMonth)+"\ntype: "+Type;
    }
    
}
class Employee{
    int Id;
    String FirstName;
    String LastName;
    int Salary;
    
    //constructor
    Employee(int id,String firstName,String lastName,int salary){
    Id=id;
    FirstName=firstName;
    LastName=lastName;
    Salary=salary;
    }
    //methods
    int get_Id(){
        return Id;
    }
    String get_FirstName(){
       return FirstName; 
    }
    String get_LastName(){
        return LastName;
    }
    String get_Name(){
        return FirstName+LastName;
    }
    int get_Salary(){
        return Salary;
    }
    void set_Salary(int salary){
        Salary=salary;
    }
    int get_AnnualSalary(){
        return Salary*12;
    }
    double raiseSalary(double percentage){
      //double per=(percentage/100)*Salary ;
      return Salary+(percentage/100)*Salary;
        
    }
    String to_String(){
        return "\nID: "+Id+"\nName: "+FirstName+LastName+"\nSALARY: "+Salary;
    }
    
}
