/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        
        //For Employee First Name
        System.out.print("Enter your First Name: ");               
        String FName = input.nextLine();      
        System.out.println("Employee First Name: " + FName);
        
        //For Employee Last Name
        System.out.print("Enter your Last Name: ");
        String LName = input.nextLine();
        System.out.println("Employee Last Name: " + LName);
        
        //For Employee Number
        int EmployeeNumber = 1004;
        if(EmployeeNumber>=1004){
            System.out.print("You may proceed Mr. Anthony Salcedo, Please check your details");
        }
        else {
            System.out.print ("You may have forgotten your employee number. Please report to Human Resource Department");
        }
            
        String Birthday = "September 14, 1993";
        String Address = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
        String PhoneNumber = "070-766-300";
        String SSS = "2696476083";
        String PhilHealth = "26-9647608-3";
        
        String PagIBIGNumber = "218002473454";
        String TINumber = "210-805-911-000";
        String Status = "Regular";
        String Position = "Payroll Manager";
        String ImmediateSupervisor = "Crisostomo, Jose";
        
        int BasicSalary = 60825;
        int RiceSubsidy = 1500;
        int PhoneAllowance = 1000;
        int ClothingAllowance = 1000;
        int GrossSemiMonthlyRate = 30413;
        double HourlyRate = 362.05;
        int GrossWageCalculation = 64325;  
        int SSSContribution = 5000;
        int PhilHealthContribution = 200; 
        int PagIBIGContribution = 200;
        int Tax = 5000;
                    
        int D1 = 8;
        int D2 = 8;
        int D3 = 8;
        int D4 = 8;
        int D5 = 8;
        int D6 = 8;
        int D7 = 8;
                        
        System.out.println("Birthday:" + Birthday);
        System.out.println("Address:" + Address);
        System.out.println("PhoneNumber:" + PhoneNumber);
        System.out.println("SSS Number:" + SSS);
        System.out.println("PhilHealth:" + PhilHealth);
        
        System.out.println("PagIBIGNUmber:" + PagIBIGNumber);
        System.out.println("TINumber:" + TINumber);
        System.out.println("Status:" + Status);
        System.out.println("Position:" + Position);
        System.out.println("ImmediateSupervisor:" + ImmediateSupervisor);
        
        System.out.println("BasicSalary:" + BasicSalary);
        System.out.println("RiceSubsidy:" + RiceSubsidy);
        System.out.println("PhoneAllowance:" + PhoneAllowance);
        System.out.println("ClothinAllowance:" + ClothingAllowance);
        System.out.println("GrossSemiMonthlyRate:" + GrossSemiMonthlyRate);
        System.out.println("HourlyRate:" + HourlyRate);

        //Cut-off Week - Enter Cut-off Week
        System.out.print("Cut-off Dates: ");
        String Week1 = input.nextLine();
        System.out.println("Cut-off Week: " + Week1);        

        //Day1
        System.out.print("Hours Worked on Day 1: ");
        String Day1 = input.nextLine();
        System.out.println("First Day: " + Day1);
        
        //Day2
        System.out.print("Hours Worked on Day 2: ");
        String Day2 = input.nextLine();
        System.out.println("Second Day: " + Day2);
        
        //Day3
        System.out.print("Hours Worked on Day 3: ");
        String Day3 = input.nextLine();
        System.out.println("Third Day: " + Day3);
        
        //Day4
        System.out.print("Hours Worked on Day 4: ");
        String Day4 = input.nextLine();
        System.out.println("Third Day: " + Day4);
        
        //Day5
        System.out.print("Hours Worked on Day 5: ");
        String Day5 = input.nextLine();
        System.out.println("Third Day: " + Day5);
        
        //Day6
        System.out.print("Hours Worked on Day 6: ");
        String Day6 = input.nextLine();
        System.out.println("Third Day: " + Day6);
        
        //Day7
        System.out.print("Hours Worked on Day 7: ");
        String Day7 = input.nextLine();
        System.out.println("Third Day: " + Day7);
        
        System.out.println("Sum of hours worked in a week: ");
        System.out.println(D1 + D2 + D3 + D4 + D5 + D6 + D7);
        
        System.out.println("Gross Wage Salary: "); 
        System.out.println(BasicSalary + RiceSubsidy + PhoneAllowance + ClothingAllowance);
        
        System.out.println("Net Wage Calculation: ");
        System.out.println(GrossWageCalculation - SSSContribution - PhilHealthContribution - PagIBIGContribution - Tax);

        
        input.close();  
        }
    
}
        // TODO code application logic here
  
